<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ControlPanelController extends Controller
{
    //
    public function __construct(){
       $this->middleware('loginAdminUser');
       
    }

    public function index(){

    	return view("PageMaster.ControlPanel");
    }
}
