package game.pokemon.System.Exception;

/**
 * Created by marccat on 10/3/2018.
 */

public class NotTwoHeroException extends RuntimeException {

    public NotTwoHeroException() {
        super("Don't create more a hero in same screen");
    }
}
