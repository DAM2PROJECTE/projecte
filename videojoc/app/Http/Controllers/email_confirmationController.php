<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class email_confirmationController extends Controller
{
    //
    public function index(){

    	return view('email_verification');
    }
}
