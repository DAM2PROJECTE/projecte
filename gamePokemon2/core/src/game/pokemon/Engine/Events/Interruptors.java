package game.pokemon.Engine.Events;

import java.util.HashMap;

/**
 * Created by marccat on 23/3/2018.
 */

public class Interruptors {
    private static HashMap <String, Boolean> interruptors =new HashMap<String, Boolean>();

    public static void on(String id){
        //if(Interruptors.interruptors.containsKey(id)){
            Interruptors.interruptors.put(id,true);
        /*}else{
            square = new Square(posX,posY);
            this.squares.put(posX+""+posY,square);
        }*/
    }

    public static void off(String id){
        //if(Interruptors.interruptors.containsKey(id)){
        Interruptors.interruptors.put(id,false);
        /*}else{
            square = new Square(posX,posY);
            this.squares.put(posX+""+posY,square);
        }*/
    }

    public static boolean getStateInterruptor(String id){
        if(!Interruptors.interruptors.containsKey(id)){
            Interruptors.interruptors.put(id,false);
        }
        return Interruptors.interruptors.get(id);
    }
}
