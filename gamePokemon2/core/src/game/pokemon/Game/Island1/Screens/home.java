package game.pokemon.Game.Island1.Screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import game.pokemon.Engine.Actors.Hero;
import game.pokemon.Engine.Actors.Still;


import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Engine.Screens.MapScreen.Square;
import game.pokemon.Game.Island1.Events.Transport_home_island1;
import game.pokemon.Game.Island1.Events.Transport_island1_home;
import game.pokemon.Main;

import game.pokemon.Game.Island1.Character.Protagonista;

/**
 * Created by marccat on 10/3/2018.
 */

public class home extends MapScreen {


    public home(Main game) {
        super(game);
    }

    public home(Main game,Hero hero) {
        super(game);
        this.hero = hero;
    }

    @Override
    protected void includeTextureSmall() {

        addSquare(new Still(ms.GetTexture("casa_terra")),2,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),3,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),4,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),5,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),6,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),7,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),8,1, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("casa_terra")),2,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),3,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),4,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),5,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),6,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),7,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),8,2, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("casa_terra")),2,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),3,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),4,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),5,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),6,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),7,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_terra")),8,3, Square.Level.SMALL);



        addSquare(new Still(ms.GetTexture("entrada1")),4,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("entrada2")),5,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("entrada3")),6,1, Square.Level.SMALL);



    }

    @Override
    protected void includeTextureHalf() {
        addSquare(new Still(ms.GetTexture("entrada4")),4,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("entrada5")),5,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("entrada6")),6,0, Square.Level.HALF);

    }

    @Override
    protected void includeTextureTall() {



    }

    @Override
    protected void includeCharacters() {
        //addHero(new Protagonista(new Texture("girl_run.png"),this),6,2);
        //addHero(this.hero,this.hero.getActorPosX(),this.hero.getActorPosY());
    }

    @Override
    protected void includeEvents() {
        addEvent(new Transport_home_island1(this),5,0);
    }

}
