package game.pokemon.Game.Island1.Events;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

import java.util.ArrayList;

import game.pokemon.Engine.Events.Event;
import game.pokemon.Engine.Events.TextEvent;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 12/3/2018.
 */

public class Pistas_Entrenador extends Event  {


    public Pistas_Entrenador(MapScreen map) {
        super(map);
        this.posElement =0;
    }

    @Override
    protected boolean conditions() {
        this.posElement =0;
        return true;
    }


    public void make() {
        this.eventpart.clear();
        this.eventpart.add(new TextEvent(new Texture("text_13.png"),"Pistes de entrenadora. BLA BLA BLA BLA BLA BLA BLA BLA"));
        /*this.eventpart.add(new TextEvent(new Texture("text_13.png"),"Segon missatge."));
        this.eventpart.add(new TextEvent(new Texture("text_13.png"),"Tercer missatge."));
        this.eventpart.add(new TextEvent(new Texture("text_13.png"),"Segon missatge."));
        this.eventpart.add(new TextEvent(new Texture("text_13.png"),"Tercer missatge."));*/

    }


    @Override
    public void desactive(){
        Utils.showMessage("event desactivat");
    }



}
