package game.pokemon.Game.Island1.Screens;

import com.badlogic.gdx.graphics.Texture;

import game.pokemon.Engine.Actors.Still;
import game.pokemon.Engine.Config;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Game.Island1.Events.Pistas_Entrenador;
import game.pokemon.Main;
import game.pokemon.Engine.Screens.MapScreen.Square;
import game.pokemon.Game.Island1.Character.Protagonista;

/**
 * Created by Lice on 21/03/2018.
 */

public class randomIsland extends MapScreen {


    public randomIsland(Main game) {
        super(game);
    }

    // Xavi qui no pots treballar amb el width i height
    // les classes que hereden de Map Screen ja estan preparades per treballar directament en
    // casselles

    //int width = Gdx.graphics.getWidth();
    //int height = Gdx.graphics.getHeight();

    @Override
    protected void includeTextureSmall() {

        // el primer 10 fa referenci a les casseles que hi hauran en horizontal
        //  el segon 10 les casselles en vertical
        // per tant el segon i tercer paremetre de addSquare es el numero de la casella
        // o sigui el valor de la i/j marca quina casella ha de posar la still

        for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
                addSquare(new Still(ms.GetTexture("herba1")),i,j, Square.Level.SMALL);
            }
        }
        //addSquare(new Still(ms.GetTexture("herba1")),0,0, Square.Level.SMALL);
    }

    @Override
    protected void includeTextureHalf() {
        //addSquare(new Still(ms.GetTexture("herba1")),1,0, Square.Level.HALF);
    }

    @Override
    protected void includeTextureTall() {
        //addSquare(new Still(ms.GetTexture("herba1")),5,7, Square.Level.TALL);
    }

    @Override
    protected void includeCharacters() {
        //addHero(new Protagonista(new Texture("girl_run.png"),this),4,4);
    }

    @Override
    protected void includeEvents() {
        //addEvent(new Pistas_Entrenador(this),5,7);
    }
}
