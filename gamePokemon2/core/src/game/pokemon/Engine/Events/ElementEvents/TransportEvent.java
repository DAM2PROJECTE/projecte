package game.pokemon.Engine.Events.ElementEvents;

import com.badlogic.gdx.Gdx;

import java.util.Map;

import game.pokemon.Engine.Actors.Hero;
import game.pokemon.Engine.Events.Interfaces.Action;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Game.Island1.Screens.home;
import game.pokemon.Main;

/**
 * Created by marccat on 22/3/2018.
 */

public class TransportEvent implements Action {
    private MapScreen mp;
    private int posX;
    private int posY;

    public TransportEvent(MapScreen mp, int px, int py) {
        this.mp = mp;

        this.posX = px;
        this.posY = py;
    }




    @Override
    public void make() {


        Gdx.app.postRunnable(new Runnable() {
            @Override
            public void run() {
                // process the result, e.g. add it to an Array<Result> field of the ApplicationListener.

                /*home h = new home(Main.m);
                Hero per = mp.getHero();

                per.setActorPosX(5);
                per.setActorPosY(2);
                h.setHero(per);
                Main.m.setScreen(h);*/
                MapScreen ms = (MapScreen) Main.m.getScreen();

                Hero h = ms.getHero();

                //home maph = new home(Main.m);
                h.setMap(mp);
                h.setActorPosX(posX);
                h.setActorPosY(posY);
                mp.setHero(h);
                Main.m.setScreen(mp);
                /*mp.dispose();
                mp.hide();*/
                //h.show();

                //ms.dispose();

            }
        });

    }
}
