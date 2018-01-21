<?php

use Illuminate\Http\Request;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});
Route::get("user/all","ApiUserLoginController@userAll")->middleware("apiAdmin");
Route::get("user/some","ApiUserLoginController@userSome");
Route::post("user/register","ApiUserLoginController@create");
Route::put("user/{user}","ApiUserLoginController@edit")->middleware("apiAdminUser");
Route::post("user/find/all","ApiUserLoginController@findAll")->middleware("apiAdminUser");
Route::post("user/find/some","ApiUserLoginController@findSome");
Route::delete("user/{user}","ApiUserLoginController@delete")->middleware("apiAdminUser");
Route::post("user/verify","ApiUserLoginController@verify");
Route::post("user/login","ApiUserLoginController@login");