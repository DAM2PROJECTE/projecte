package game.pokemon.Game.Island1.Events;

import com.badlogic.gdx.graphics.Texture;

import game.pokemon.Engine.Events.ElementEvents.MoveToDownEvent;
import game.pokemon.Engine.Events.ElementEvents.MoveToLeftEvent;
import game.pokemon.Engine.Events.ElementEvents.MoveToRightEvent;
import game.pokemon.Engine.Events.ElementEvents.MoveToUpEvent;
import game.pokemon.Engine.Events.ElementEvents.SeeToDownEvent;
import game.pokemon.Engine.Events.ElementEvents.SeeToLeftEvent;
import game.pokemon.Engine.Events.ElementEvents.SeeToRightEvent;
import game.pokemon.Engine.Events.ElementEvents.SeeToUpEvent;
import game.pokemon.Engine.Events.Event;
import game.pokemon.Engine.Events.ElementEvents.TextEvent;
import game.pokemon.Engine.Events.Interruptors;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;

/**
 * Created by marccat on 12/3/2018.
 */

public class Pistas_Entrenador extends Event  {

    public Pistas_Entrenador(MapScreen map) {
        super(map);
    }

    @Override
    public boolean conditions() {
        return Interruptors.getStateInterruptor("event1");
    }

    @Override
    protected void getsInstruccions() {
        this.instruccions.clear();
        this.instruccions.add(new TextEvent(new Texture("text_2.png"),this.map,"Dona una volta al meu voltant","segon missatge vuit"));
        /*this.instruccions.add(new MoveToRightEvent(this.map.getHero(),this.map));
        this.instruccions.add(new SeeToRightEvent(this.map.getHero()));
        this.instruccions.add(new MoveToUpEvent(this.map.getHero(),this.map));
        this.instruccions.add(new SeeToUpEvent(this.map.getHero()));
        this.instruccions.add(new MoveToUpEvent(this.map.getHero(),this.map));
        this.instruccions.add(new MoveToLeftEvent(this.map.getHero(),this.map));
        this.instruccions.add(new SeeToLeftEvent(this.map.getHero()));
        this.instruccions.add(new MoveToLeftEvent(this.map.getHero(),this.map));
        this.instruccions.add(new SeeToDownEvent(this.map.getHero()));
        this.instruccions.add(new MoveToDownEvent(this.map.getHero(),this.map));
        this.instruccions.add(new MoveToDownEvent(this.map.getHero(),this.map));
        this.instruccions.add(new SeeToRightEvent(this.map.getHero()));
        this.instruccions.add(new MoveToRightEvent(this.map.getHero(),this.map));
        this.instruccions.add(new SeeToUpEvent(this.map.getHero()));
        this.instruccions.add(new TextEvent(new Texture("text_2.png"),this.map,"Perfecte. Ets obedient"));*/
        Interruptors.off("event1");
        Interruptors.on("event2");
    }





}
