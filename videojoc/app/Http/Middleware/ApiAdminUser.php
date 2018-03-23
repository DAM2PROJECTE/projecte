<?php

namespace App\Http\Middleware;

use Closure;


class apiAdminuser
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
        ////falta////
       


        return $next($request);

    }
}
