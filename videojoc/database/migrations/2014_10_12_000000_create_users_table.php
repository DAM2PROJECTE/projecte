<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateUsersTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('users', function (Blueprint $table) {
            $table->increments('id_user');
            $table->string('userName',15)->unique()->nullable(false);
            $table->string('name',20)->nullable(false);
            $table->string('surname1',20)->nullable(true);
            $table->string('surname2',20)->nullable(true);
            $table->string('password',60)->nullable(false);
            $table->string('email',50)->nullable(false)->unique();
            $table->boolean('status')->nullable(false);
            $table->string('confirmation_code',50)->nullable(false)->unique();
            $table->integer('points')->nullable(false);
            $table->date('birthdate')->nullable(true);
            $table->integer('role')->unsigned();
            $table->boolean('status_delete')->nullable(false);
            $table->string('pictureProfile',100)->nullable(true);
            $table->char('gender',1)->nullable(true);
            $table->timestamps();
            $table->foreign('role')->references('id')->on('DiccionariDades');

        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('users');
    }
}
