<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserProfileController extends Controller
{
    //

	public function __construct(){
       $this->middleware('loginUser',["only"=>"index"]);
       
    }

    public function index(){

    	return view("userProfile");
    }
}
