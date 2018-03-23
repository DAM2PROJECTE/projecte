package game.pokemon.Game.Island1.Events;

import game.pokemon.Engine.Events.ElementEvents.MoveToDownEvent;
import game.pokemon.Engine.Events.ElementEvents.TransportEvent;
import game.pokemon.Engine.Events.Event;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Game.Island1.Screens.home;
import game.pokemon.Main;

/**
 * Created by marccat on 22/3/2018.
 */

public class Transport_island1_home extends Event {

    public Transport_island1_home(MapScreen map) {
        super(map);
    }

    @Override
    public boolean conditions() {
        return true;
    }

    @Override
    protected void getsInstruccions() {
        this.instruccions.clear();
        //home h = new home(Main.m);
        this.instruccions.add(new TransportEvent(new home(Main.m),5,2));
    }
}
