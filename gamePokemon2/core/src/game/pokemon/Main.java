package game.pokemon;

import com.badlogic.gdx.Game;

import game.pokemon.Game.Island1.Map.island1;

public class Main extends Game {

    @Override
    public void create() {
        //call to First Screen
        setScreen(new island1(this));
    }
}
