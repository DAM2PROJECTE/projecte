<?php

namespace App\Http\Middleware;

use Closure;

class apiAdmin
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
           return response("403 - Unauthorized",$httpStatusCode=403,$headers=[]);
        }
        if(session("user")->role!=2){
            return response("403 - Unauthorized",$httpStatusCode=403,$headers=[]);
        }

      return $next($request);
    }
}
