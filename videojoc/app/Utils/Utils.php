<?php 

namespace App;
use GuzzleHttp\Client;
use GuzzleHttp\Psr7;
use GuzzleHttp\Exception\RequestException;

class Utils{



	public static function getUser($field,$value){
		try{
		 $client = new Client(['headers'=>[ 'content-type' => 'application/json', 'Accept' => 'application/json' ],'Authorization' => ['Basic '],]);
            $response = $client->request('post','http://localhost/videojoc3/public/api/user/find/all'
            ,['json'=> [ 
                    'field' => $field,
                    'name' => $value
                   
            ],]);
           return json_decode($response->getBody()->getContents());

    } catch (RequestException $e) {

      return json_decode($e->getResponse()->getBody()->getContents());
    }
	}

  public static function login($value, $password){

    $regexp="/([A-Za-z0-9_.-]+@[A-Za-z0-9_.-]+\.[A-Za-z0-9_-]+)/";

    if (preg_match($regexp, $value))
    {
      $data=["email"=>$value,"password"=>$password];

    }else{

       $data=["userName"=>$value,"password"=>$password];
    }


    try{
      $client = new Client(['headers'=>[ 'content-type' => 'application/json', 'Accept' => 'application/json' ],
                            'Authorization' => ['Basic '],]);
      $response = $client->request('post','http://localhost/videojoc3/public/api/user/login',['json'=> $data,]);
      return $response;
    } catch (RequestException $e) {
      return $e->getResponse();
    }
  }

  public static function create($userName,$name,$surname1,$surname2,$password,$email,$birthdate,$role,$gender){
    try{
     
      $client = new Client(['headers'=>[ 'content-type' => 'application/json', 'Accept' => 'application/json' ],]);
                $response = $client->request('post','http://localhost/videojoc3/public/api/user/register'
                ,['json'=> [ 

                    'userName' => $userName,
                    'name' => $name,
                    'surname1' => $surname1,
                    'surname2' => $surname2,
                    'password' => $password,
                    'email' => $email,
                    'birthdate' => $birthdate,
                    'role' => $role,
                    'gender' => $gender
                                                    
                ],]);
      dd($response);
      return $response;
    } catch (RequestException $e) {

      return $e->getResponse();
    }
  } 

  public static function verify(){

  }


}
?>