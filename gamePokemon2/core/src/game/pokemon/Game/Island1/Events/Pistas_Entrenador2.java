package game.pokemon.Game.Island1.Events;

import com.badlogic.gdx.graphics.Texture;

import game.pokemon.Engine.Events.ElementEvents.TextEvent;
import game.pokemon.Engine.Events.Event;
import game.pokemon.Engine.Events.Interruptors;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 12/3/2018.
 */

public class Pistas_Entrenador2 extends Event  {

    public Pistas_Entrenador2(MapScreen map) {
        super(map);
    }

    @Override
    public boolean conditions() {
        Utils.showMessage("interruptor: "+Interruptors.getStateInterruptor("event2"));
        return Interruptors.getStateInterruptor("event2");
    }

    @Override
    protected void getsInstruccions() {
        this.instruccions.clear();
        this.instruccions.add(new TextEvent(new Texture("text_2.png"),this.map,"Ja has parlat amb aquest cartell",""));
        //Interruptors.off("event2");
        //Interruptors.on("event1");

    }





}
