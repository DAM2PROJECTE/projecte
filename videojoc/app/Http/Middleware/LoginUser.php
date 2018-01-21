<?php

namespace App\Http\Middleware;
use Illuminate\Http\Request;

use Closure;

class LoginUser
{
    /**
     * Handle an incoming request.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \Closure  $next
     * @return mixed
     */
    public function handle($request, Closure $next)
    {
        if(is_null(session("user"))){
            return redirect('home');
        }
        return $next($request);
    }
}
