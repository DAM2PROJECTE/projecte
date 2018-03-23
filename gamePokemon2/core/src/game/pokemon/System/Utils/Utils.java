package game.pokemon.System.Utils;

import game.pokemon.Engine.Config;

/**
 * Created by marccat on 11/3/2018.
 */

public class Utils {
    public static void showMessage(String message){
        if(Config.debug){
            System.out.println(message);
        }
    }
}
