package game.pokemon.Game.Island1.Map;

import com.badlogic.gdx.graphics.Texture;

import game.pokemon.Engine.Actors.Still;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Game.Island1.Events.Pistas_Entrenador;
import game.pokemon.Main;
import game.pokemon.Engine.Screens.MapScreen.Square;
import game.pokemon.Game.Island1.Character.Protagonista;

/**
 * Created by marccat on 10/3/2018.
 */

public class island1 extends MapScreen {


    public island1(Main game) {
        super(game);
    }

    @Override
    protected void includeTextureSmall() {
        addSquare(new Still(ms.GetTexture("herba1")),2,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,1, Square.Level.SMALL);


        addSquare(new Still(ms.GetTexture("herba1")),2,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,2, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,3, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,4, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,5, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,6, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,7, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,8, Square.Level.SMALL);


    }

    @Override
    protected void includeTextureHalf() {
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),2,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),3,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),4,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),5,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),6,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),7,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),8,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),9,0, Square.Level.HALF);


        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,1, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,1, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),8,1, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),9,1, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,2, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,2, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),8,2, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),9,2, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),8,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),9,3, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),8,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),9,4, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),8,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),9,5, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),8,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),9,6, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,7, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,7, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("cartelito")),5,7, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),8,7, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),9,7, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,8, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,8, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),8,8, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),9,8, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),2,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),3,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),4,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),5,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),6,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),7,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),8,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),9,9, Square.Level.HALF);

    }

    @Override
    protected void includeTextureTall() {
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),2,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),3,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),4,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),5,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),6,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),7,1, Square.Level.TALL);
    }

    @Override
    protected void includeCharacters() {

       addHero(new Protagonista(new Texture("girl_run.png"),this),4,4);
    }

    @Override
    protected void includeEvents() {
       addEvent(new Pistas_Entrenador(this),5,7);
       // addEvent(new Text(this),5,7);
    }

}
