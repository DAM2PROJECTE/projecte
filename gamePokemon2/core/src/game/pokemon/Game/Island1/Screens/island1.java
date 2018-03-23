package game.pokemon.Game.Island1.Screens;

import com.badlogic.gdx.graphics.Texture;

import game.pokemon.Engine.Actors.Hero;
import game.pokemon.Engine.Actors.Still;

import game.pokemon.Engine.Events.ElementEvents.TransportEvent;
import game.pokemon.Engine.Screens.MapScreen.Square;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Game.Island1.Events.Pistas_Entrenador;
import game.pokemon.Game.Island1.Events.Pistas_Entrenador2;
import game.pokemon.Game.Island1.Events.Transport_island1_home;
import game.pokemon.Game.Island1.Events.prova1;
import game.pokemon.Main;

import game.pokemon.Game.Island1.Character.Protagonista;

/**
 * Created by marccat on 10/3/2018.
 */

public class island1 extends MapScreen {


    public island1(Main game, Hero hero) {
        super(game);
        this.hero=hero;

    }
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
        addSquare(new Still(ms.GetTexture("herba1")),8,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),9,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),10,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),11,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),12,1, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),13,1, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),8,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),9,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),10,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),11,2, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),12,2, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),13,2, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("casa_baix2")),7,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),8,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),9,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),10,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),11,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),12,3, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),13,3, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),8,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),9,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),10,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),11,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),12,4, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),13,4, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),8,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),9,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),10,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),11,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),12,5, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),13,5, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),8,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),9,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),10,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),11,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),12,6, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),13,6, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),8,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),9,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),10,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),11,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),12,7, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),13,7, Square.Level.SMALL);

        addSquare(new Still(ms.GetTexture("herba1")),2,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),3,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),4,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),5,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),6,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),7,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),8,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),9,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),10,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),11,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),12,8, Square.Level.SMALL);
        addSquare(new Still(ms.GetTexture("herba1")),13,8, Square.Level.SMALL);



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
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),10,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),11,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),12,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),13,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),14,0, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),15,0, Square.Level.HALF);



        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,1, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,1, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),14,1, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),15,1, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,2, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,2, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),14,2, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),15,2, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_baix1")),6,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_baix3")),8,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_baix4")),9,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_baix5")),10,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),14,3, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),15,3, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_mig1")),6,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_mig2")),7,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_mig3")),8,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_mig4")),9,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("casa_mig5")),10,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),14,4, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),15,4, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_baix1")),6,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_baix2")),7,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_baix3")),8,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_baix4")),9,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_baix5")),10,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),14,5, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),15,5, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_centrat1")),6,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_centrat2")),7,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_centrat3")),8,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_centrat4")),9,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("teulada_centrat5")),10,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),14,6, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),15,6, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,7, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,7, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("cartelito")),3,7, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),14,7, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),15,7, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),0,8, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),1,8, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_mitja_ombra")),14,8, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_mitja_ombra")),15,8, Square.Level.HALF);

        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),0,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),1,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),2,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),3,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),4,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),5,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),6,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),7,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),8,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),9,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),10,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),11,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_baix")),12,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_baix")),13,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_sup")),14,9, Square.Level.HALF);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_sup")),15,9, Square.Level.HALF);

    }

    @Override
    protected void includeTextureTall() {
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),2,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),3,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),4,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),5,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),6,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),7,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),8,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),9,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),10,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),11,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),12,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),13,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_esquerre_dalt_vuit")),14,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("arbre_dret_dalt_vuit")),15,1, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("teulada_dalt1")),6,7, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("teulada_dalt2")),7,7, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("teulada_dalt3")),8,7, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("teulada_dalt4")),9,7, Square.Level.TALL);
        addSquare(new Still(ms.GetTexture("teulada_dalt5")),10,7, Square.Level.TALL);


    }

    @Override
    protected void includeCharacters() {

       // addHero(new Hero(new Texture("girl_run.png"),this)4,4);
    }

    @Override
    protected void includeEvents() {
        addEvent(new Pistas_Entrenador(this),3,7);
        addEvent(new Pistas_Entrenador2(this),3,7);
        addEvent(new prova1(this),4,3);
        addEvent(new Transport_island1_home(this),7,3);


    }



}
