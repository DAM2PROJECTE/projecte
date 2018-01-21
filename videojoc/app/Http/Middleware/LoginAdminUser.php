<?php

namespace App\Http\Middleware;

use Closure;

class LoginAdminUser
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
        if(session("user")->role!=2){
            return redirect('home');
        }

      return $next($request);
    }
}
