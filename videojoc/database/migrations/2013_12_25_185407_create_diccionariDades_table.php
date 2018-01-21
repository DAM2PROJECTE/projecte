<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateDiccionariDadesTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('DiccionariDades', function (Blueprint $table) {
            $table->increments('id');
            $table->string('term',50)->nullable(false);
            $table->string('type',50)->nullable(false);
            $table->unique('term', 'type');
        });

        DB::table('DiccionariDades')->insert([
                'term' => 'basic',
                'type' => 'role',
                
        ]);

        DB::table('DiccionariDades')->insert([
                'term' => 'administrator',
                'type' => 'role',
                
        ]);
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('diccionariDades');
    }
}
