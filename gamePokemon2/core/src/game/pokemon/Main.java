package game.pokemon;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import game.pokemon.Engine.Events.Interruptors;
import game.pokemon.Game.Island1.Character.Protagonista;
import game.pokemon.Game.Island1.Screens.island1;
import game.pokemon.Game.Island1.Screens.randomIsland;


public class Main extends Game {
    public static Main m;
    @Override
    public void create() {
        //call to First Screen
        Main.m = this;
        Interruptors.on("event1");
        randomIsland is = new randomIsland(this);
        is.setHero(new Protagonista(new Texture("girl_run.png"),is,0,0));
        setScreen(is);
    }
}
