package game.pokemon.System.Exception;

/**
 * Created by marccat on 10/3/2018.
 */

public class SquareNotFound extends RuntimeException {

    public SquareNotFound() {
        super("You want acces a Square not found.");
    }
}
