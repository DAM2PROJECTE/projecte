package game.pokemon.Game.Island1.Events;

import game.pokemon.Engine.Events.ElementEvents.MoveToDownEvent;
import game.pokemon.Engine.Events.Event;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;

/**
 * Created by marccat on 18/3/2018.
 */

public class prova1 extends Event {

    public prova1(MapScreen map) {
        super(map);
    }

    @Override
    public boolean conditions() {
        return true;
    }

    @Override
    protected void getsInstruccions() {
        this.instruccions.clear();
        this.instruccions.add(new MoveToDownEvent(this.map.getHero(), this.map));
    }

}
