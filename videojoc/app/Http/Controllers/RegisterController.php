<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use GuzzleHttp\Client;
use GuzzleHttp\Psr7;
use GuzzleHttp\Exception\RequestException;

class RegisterController extends Controller
{



    public function __construct(){
       //$this->middleware('publicRoute');
      
    }

    public function index()
    {
        return view("register");
    }

    public function register(Request $request){




            if($request->input("password")===$request->input("password-confirmed")){
               $response = \App\Utils::create($request->input("userName"),
                                              $request->input("name"),
                                              $request->input("surname1"),
                                              $request->input("surname2"),
                                              $request->input("password"),
                                              $request->input("email"),
                                              $request->input("birthdate"),
                                              1, $request->input("gender"));
               
               if($response->getStatusCode()>=200 &&  $response->getStatusCode()<=299){

                $datos["mensaje"] = json_decode($response->getBody()->getContents());

                return redirect()->action('LoginController@index');

               }else{
                //dd($response->getBody()->getContents());
                $error[] = $response->getBody()->getContents();
                $datos["error"] = $error;
                return $this->index()->with($datos);


               }

                //dd($response->getBody()->getContents());

            }else{
                $error[] = "Les contrasenyes no coincideixen";
                $datos["error"] = $error;
                return $this->index()->with($datos);
            }
            return $this->index()->with($datos);


    }

    public function verify($code){

         $client = new Client(['headers'=>[ 'content-type' => 'application/json', 'Accept' => 'application/json' ],]);
                    $response = $client->request('post','http://localhost/videojoc3/public/api/user/verify'
                    ,['json'=> [ 

                        'code' => $code
                                                   
                    ],]);
        
        $datos["mensaje"] = $response->getBody()->getContents();
      
        $response = \App\Utils::getUser('confirmation_code', $code, 'http://localhost/videojoc3/public/api/user/find/all');

         if(sizeof($response)==1){
            session(["user"=>$response[0]]);
         }   
       

        return view("email_verification")->with($datos);
    }
}
