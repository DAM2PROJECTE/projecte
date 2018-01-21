<?php

namespace App\Http\Controllers;

use Illuminate\Database\QueryException;
use Illuminate\Routing\ResponseFactory;
use Illuminate\Http\Request;
use Illuminate\Http\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Mail;
use Carbon\Carbon;
use Hash;
use GuzzleHttp\Exception\GuzzleException;
use Illuminate\Support\Facades\DB;

class ApiUserLoginController extends Controller
{
      
    public function userAll()
    {
        //cerca el usuari amb totes les dades relacionades amb ell(foreign key relations)
        $players = \App\Usuaris::with('diccionaridades')->get();
        //comporva que no hi haguin dades
        if (!$players) {
             //si no hi ha recuperat res (no hi han jugadors ), retorna un misstage de sense jugadors
            return response("416 - They aren't players",$httpStatusCode=416,$headers=[]);
        }else{
            //return $players;
             return response($players,$httpStatusCode=200,$headers=[]);
        }
    }

    public function userSome()
    {
        //cerca el usuari amb totes les dades relacionades amb ell(foreign key relations)
        //$players = \App\Usuaris::all()->get(['userName']);
        $players = DB::table("users")->get(['userName','name','surname1','surname2','email','points','birthdate']);
        //comporva que no hi haguin dades
        if (!$players) {
            //si no hi ha recuperat res (no hi han jugadors ), retorna un misstage de sense jugadors
            return response("416 - They aren't players",$httpStatusCode=416,$headers=[]);
        }else{
            //return $players;
            return response($players,$httpStatusCode=200,$headers=[]);
        }
    }

    public function create(Request $request)
    {
        if ($request->has(['userName','password','email','role'])) {
                $usuari = new \App\Usuaris();
                if(strpos($request->input('name'), "@")){
                    return response("406 - caracteres nno validos en 'UserName'",$httpStatusCode=406,$headers=[]);
                } else{
                    $usuari->userName = $request->input('name');
                } 

                $usuari->userName = $request->input('userName');
                $usuari->role = $request->input('role');
                $usuari->password = bcrypt($request->input('password'));
                $usuari->email = $request->input('email');
                $usuari->confirmation_code = $this->newCode();
                $usuari->status = 0;
                $usuari->points = 0;
                $usuari->status_delete = 0;


                if($request->has('name')){
                  $usuari->name = $request->input('name');
                }

                if($request->has('surname1')){
                    $usuari->surname1 = $request->input('surname1');
                }

                if($request->has('surname2')){
                    $usuari->surname2 = $request->input('surname2');
                }

                if($request->has('birthdate')){
                    $usuari->birthdate = Carbon::parse($request->input('birthadate'))->format("Y-m-d");
                }

                if($request->has('role')){
                    $usuari->role = $request->input('role');
                }

                if($request->has('points')){
                    $usuari->points = $request->input('points');
                }

                if($request->has('status_delete')){
                    $usuari->status_delete = $request->input('status_delete');
                }

                if($request->has('picture_profile')){
                    $usuari->picture_profile = $request->input('picture_profile');
                }

                if($request->has('gender')){
                    $usuari->gender = $request->input('gender');
                }
            


           try
            {

                $usuari->save();
                $mensaje = "El jugador ".$usuari->userName . " ha sido creado correctamente";
                $data = array(
                'nom' => $usuari->userName,
                'code' => "http://localhost/videojoc3/public/verify/register/".$usuari->confirmation_code,
                'email' => $usuari->email
                );

                Mail::send('partials.email',$data, function($message) use ($data) {

                    $message->from('koskingdomofsins@gmail.com','KoS');
                    $message->to($data['email'])->subject('Comença la aventura de la teva vida');

                });

                 return response($mensaje,$httpStatusCode=200,$headers=[]);

            }
            catch (QueryException $e){

                $error[] = \App\ErroresBD::mensajeError($e);
               // $datos['error'] = $error;
                //throw new HttpException(400, $error);
                 return response($error,$httpStatusCode=400,$headers=[]);
            }
        }else{

            return response("406 - Missing data to continue the action",$httpStatusCode=406,$headers=[]);
        }   
    }

    public function edit(Request $request, $id)
    {



            $usuari = \App\Usuaris::find($id);
            if($usuari!=null){
                if($request->has('name')){
                  $usuari->name = $request->input('name');
                }

                if($request->has('surname1')){
                    $usuari->surname1 = $request->input('surname1');
                }

                if($request->has('surname2')){
                    $usuari->surname2 = $request->input('surname2');
                }

                if($request->has('birthdate') && $usuari->birthdate==null){
                    $usuari->birthdate = Carbon::parse($request->input('birthadate'))->format("Y-m-d");
                }

                if($request->has('role')){
                    $usuari->role = $request->input('role');
                }

                if($request->has('points')){
                    $usuari->points = $request->input('points');
                }

                if($request->has('status_delete')){
                    $usuari->status_delete = $request->input('status_delete');
                }

                if($request->has('picture_profile')){
                    $usuari->picture_profile = $request->input('picture_profile');
                }

                if($request->has('gender')){
                    $usuari->gender = $request->input('gender');
                }

               try
                {

                    $usuari->save();
                    return response( "200 - Modified data correctly",$httpStatusCode=200,$headers=[]);

                }catch (QueryException $e){

                    $error[] = \App\ErroresBD::mensajeError($e);
                    return response("400 - ".$error,$httpStatusCode=400,$headers=[]);
                }

            }else{

                 return response("404 - User not found ".$error,$httpStatusCode=404,$headers=[]);
            }
    }


    public function findAll(Request $request)
    {

        //comprova que existeixi la id
        if (!$request->has(['field','name'])) {
            // si no ha rebut cap, enviar error de que no sap la id
            return response("406 - Missing data to continue the action",$httpStatusCode=406,$headers=[]);
        
        }else{
            //cerca el usuari
            $usuari = \App\Usuaris::with('diccionaridades')->where($request->input('field'),"=",$request->input('name'))->get();
            if($usuari!=null){
                
                    return response($usuari,$httpStatusCode=200,$headers=[]);
                
            }else{

                return response("404 - There are not user found with caracteristics",$httpStatusCode=404,$headers=[]);
            }
       
        }
    }

    public function findSome(Request $request)
    {

        //comprova que existeixi la id
        if (!$request->has(['field','name'])) {
            // si no ha rebut cap, enviar error de que no sap la id
            return response("406 - Missing data to continue the action",$httpStatusCode=406,$headers=[]);
        
        }else{
            //cerca el usuari
            $usuari = \App\Usuaris::where($request->input('field'),"=",$request->input('name'))->get(['userName','name','surname1','surname2','email','points','birthdate']);
            if($usuari!=null){
                if(sizeof($usuari)>1){
                    return response($usuari[0],$httpStatusCode=200,$headers=[]);
                }else{
                    return response($usuari,$httpStatusCode=200,$headers=[]);
                }
            }else{

                return response("404 - There are not user found",$httpStatusCode=404,$headers=[]);
            }
       
        }
    }

    public function delete(Request $request,$id)
    {
        //comprova que existeixi la id 
        if (!$id) {
            // si no ha rebut cap, enviar error de que no sap la id
            return response("416 - Unidentified id",$httpStatusCode=416,$headers=[]);
        }else{
            //cerca el usuari
            $usuari = \App\Usuaris::find($id);
            //comprova que la pogut cercar
            if($usuari!=null){
                try{
                    //borra el usuari
                    $usuari->delete();
                    //envia un missatge de satisfacció
                    return response("200 - ".$id->userName." has been eliminated correctly",$httpStatusCode=200,$headers=[]);
                }catch(QueryException $e){
                    //cerca un missatge sengins el error donat
                    $error[] = \App\ErroresBD::mensajeError($e);
                    //retorna el error 
                    return response($error, $httpStatusCode=416,$headers=[]);
                }   
            }else{
                //retorna un missatge que el usuari no existeix 
                return  response("404 - Player don't exist",$httpStatusCode=404,$headers=[]);
            }
       
        }
    }

    public function verify(Request $request)
    {
        $code = $request->input("code");
        //comprova que existeixi la id 
        if (!$code) {
           // si no ha rebut cap, enviar error de que no sap la id
            return response("416 - Unidentified id",$httpStatusCode=416,$headers=[]);
        }else{
            
            $usuari = \App\Usuaris::where("confirmation_code","=",$code)->get();
            //dd($usuar[0]);
            if($usuari[0]==null){
                return response("404 - Player don't exist",$httpStatusCode=404,$headers=[]);

            }else{
                if($usuari[0]->status==1){
                    return response("225 - account is already verified correctly",$httpStatusCode=225,$headers=[]);
                }else{
                    $usuari[0]->status=1;
                    $usuari[0]->save();
                    //retorna el usuari
                    return response("200 - Account has been verified correctly",$httpStatusCode=200,$headers=[]);

                }
              
            }
        }
    }
 
    public function login(Request $request)
    {
        $psswrd = $request->input("password");
        if($request->has('email')){
            $user = \App\Usuaris::where("email","=",$request->input("email"))->get();
        }
        if($request->has('userName')){
            $user = \App\Usuaris::where("userName","=",$request->input("userName"))->get();
        
        }
        
        if(empty($user[0])){
            return response("404 - username o email not correct",$httpStatusCode=404,$headers=[]);
        }else{
          if(Hash::Check($psswrd,$user[0]->password)){
               return response("200 - User Found",$httpStatusCode=200,$headers=[]);
           }else{
               return response("404 - password not correct",$httpStatusCode=404,$headers=[]);
           }
           
        }
      
  
     }
     
     private function newCode() 
     {
        do {
            $code = str_random(50);
            $user = \App\Usuaris::where('confirmation_code',"=",$code)->get();
        } while ($user==null);

        return $code;
     }

 /*    private function DataVerification($field,$value){


        switch($field){

            case"userName",:
             if (!preg_match("/([A-Za-z0-9])\w+/", $value)){
                $error= $field." has invalid characters ";

             } else{
                $error=null;
             }
            break;

            case"userName1","username2":
             if (!preg_match("/([A-Za-z])\w+/", $value)){
                $error= $field." has invalid characters ";

             } else{
                $error=null;
             }
            break;

            case"email":
             if (!preg_match("/([A-Za-z0-9_.-]+@[A-Za-z0-9_.-]+\.[A-Za-z0-9_-]+)/", $value)){
                $error= $field." has invalid characters ";

             } else{
                $error=null;
             }
            break;

        }
           
            return $error; 
     }*/

}
