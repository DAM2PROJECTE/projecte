package game.pokemon.Engine.Events;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

import java.util.ArrayList;

import game.pokemon.Engine.Actors.BaseActors;
import game.pokemon.Engine.Config;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 11/3/2018.
 */

public abstract class Event extends BaseActors  implements InputProcessor{

    protected ArrayList<BaseActors> eventpart;
    protected MapScreen map;
    protected TextEvent tv;
    protected int posElement;

    //protected InputProcessorEvent processor;

    public Event(MapScreen map) {
        super(new Texture("text_13.png"));
        this.map = map;
        this.eventpart =  new ArrayList<BaseActors>();
       // this.processor = new InputProcessorEvent();
    }

   /* @Override
    public void draw(Batch batch, float parentAlpha) {
        //super.draw(batch, parentAlpha);
        batch.draw(this.img,0,0,this.map.config.getWithGame(),32*3);
    }*/

   public  void active(){

       if (conditions()) {
           make();
           addElementEvent(this);
       }
   }

    protected abstract void make();

    protected abstract boolean conditions();

    public abstract void desactive();

   protected void addElementEvent(Event event){
        this.map.activeEvents(event);
   }


    @Override
    public boolean keyDown(int keycode) {

        switch (keycode){
            case Config.BUTTON_A:
                //Utils.showMessage("event desactivat");
                Utils.showMessage("posElemnt: "+this.posElement);
                Utils.showMessage("posElemnt: "+this.eventpart.size());
                if(this.posElement<this.eventpart.size()-1){
                    this.posElement++;
                    /*this.map.desactiveEvents(eventpart.get(posElement));
                    this.map.activeEvents(eventpart.get(posElement+1));*/
                }else{
                    this.map.desactiveEvents(this);
                }

                //this.map.desactiveEvents(this);
                //this.map.desactiveEvents(this.tv);
                //this.desactive();
                break;
        }
        return true;
    }


    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        //super.draw(batch, parentAlpha);
        this.eventpart.get(this.posElement).draw(batch,parentAlpha);
    }

}
