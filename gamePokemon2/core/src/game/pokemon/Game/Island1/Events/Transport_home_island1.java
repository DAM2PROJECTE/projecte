package game.pokemon.Game.Island1.Events;

import game.pokemon.Engine.Audio.Effect;
import game.pokemon.Engine.Events.ElementEvents.TransportEvent;
import game.pokemon.Engine.Events.Event;
import game.pokemon.Engine.Events.Interruptors;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Game.Island1.Screens.home;
import game.pokemon.Game.Island1.Screens.island1;
import game.pokemon.Main;

/**
 * Created by marccat on 22/3/2018.
 */

public class Transport_home_island1  extends Event {

    public Transport_home_island1(MapScreen map) {
        super(map);
    }

    @Override
    public boolean conditions() {
        return true;
    }

    @Override
    protected void getsInstruccions() {
        this.instruccions.clear();
        //island1 is = new island1(Main.m);
        this.map.getEffect().play(Effect.DOOR_EXIT);
        this.instruccions.add(new TransportEvent(new island1(Main.m),7,3));
        Interruptors.on("DoorExit");

    }
}