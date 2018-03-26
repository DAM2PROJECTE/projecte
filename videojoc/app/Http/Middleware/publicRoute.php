<?php

namespace App\Http\Middleware;

use Closure;

class publicRoute
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
        if(!is_null(session("user"))){

            return redirect('home');
        }

        return $next($request);
    }
}