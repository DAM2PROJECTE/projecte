package game.pokemon.Game.Island1.Events;

import com.badlogic.gdx.graphics.Texture;

import game.pokemon.Engine.Events.ElementEvents.MoveToDownEvent;
import game.pokemon.Engine.Events.ElementEvents.TextEvent;
import game.pokemon.Engine.Events.ElementEvents.TransportEvent;
import game.pokemon.Engine.Events.Event;
import game.pokemon.Engine.Events.Interruptors;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Game.Island1.Screens.home;
import game.pokemon.Main;

/**
 * Created by marccat on 22/3/2018.
 */

public class Transport_island1_homeB extends Event {

    public Transport_island1_homeB(MapScreen map) {
        super(map);
    }

    @Override
    public boolean conditions() {
        return Interruptors.getStateInterruptor("DoorExit");
    }

    @Override
    protected void getsInstruccions() {
        this.instruccions.clear();
        //home h = new home(Main.m);
        //this.instruccions.add(new TransportEvent(new home(Main.m),5,1));
        this.instruccions.add(new MoveToDownEvent(this.map.getHero(),this.map));
        this.instruccions.add(new TextEvent(new Texture("text_1.png"),this.map,"has surtit de la casa",""));
        Interruptors.off("DoorExit");
    }
}
