<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use GuzzleHttp\Client;
use GuzzleHttp\Psr7;
use GuzzleHttp\Exception\RequestException;
use Illuminate\Database\QueryException;




class LoginController extends Controller
{


    public function __construct(){
       $this->middleware('publicRoute',["only"=>"index","login"]);
       $this->middleware('loginUser',["only"=>"logout"]);
    }


    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        
        //dd(session('user'));
        return view("login");
    }

    public function login(Request $request)
    {
      
      $login_acept = \App\Utils::login($request->input("name"),$request->input("password"));
        if($login_acept->getStatusCode()>=200 &&  $login_acept->getStatusCode()<=299){
          $response = \App\Utils::getUser('userName', $request->input("name"), 'http://localhost/videojoc3/public/api/user/find/all');
          $user_session = $response[0];
          session(["user"=>$user_session]);
          return redirect()->action('PrincipalController@home');
        } else{
          $error[] =  $login_acept->getBody()->getContents();
          $datos["error"] = $error;
          return view("login")->with($datos);

        }



       
    }

    public function logout(){
        session(["user"=>null]);
        return redirect()->action('LoginController@index');
   }

}
