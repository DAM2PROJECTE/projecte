package game.pokemon.Engine.Events;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;

import java.util.ArrayList;
import java.util.Map;

import game.pokemon.Engine.Actors.BaseActors;
import game.pokemon.Engine.Config;
import game.pokemon.Engine.Events.Interfaces.Action;
import game.pokemon.Engine.Events.Interfaces.Draw;
import game.pokemon.Engine.Events.Interfaces.ElementEvent;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 16/3/2018.
 */

public abstract class Event extends InputAdapter implements Runnable{
    protected Map<String,Event> events;
    protected ArrayList<ElementEvent> instruccions;
    protected MapScreen map;
    private int posInstruction;
    private Thread t;
    private boolean pauseEvent =false;

    public Event(MapScreen map) {
        this.map = map;
        this.instruccions = new ArrayList<ElementEvent>();
        this.posInstruction = 0;
        //getsInstruccions();

       //t.start();
        pauseEvent = false;

    }
   public abstract boolean conditions();
   protected abstract void getsInstruccions();

     public boolean active(){
        Utils.showMessage("Event activat");
        if (conditions()) {
           getsInstruccions();
            /*if(this.instruccions.get(this.posInstruction) instanceof Draw){
                this.map.addDrawEvent((Draw)this.instruccions.get(this.posInstruction));
            }
            if(this.instruccions.get(this.posInstruction) instanceof Action){
                ((Action)this.instruccions.get(this.posInstruction)).make();
            }
            this.posInstruction++;*/
            this.map.setInputProcessor(this);
            t = new Thread(this);
            t.start();
            return true;

        }else{
            return false;
        }

    }

     synchronized public  void desactive(){
        if(this.instruccions.get(this.instruccions.size()-1).getClass().getInterfaces()[0].getSimpleName().equals("Draw")){
            this.map.removeActorInStage((BaseActors)this.instruccions.get(this.instruccions.size()-1));
        }
        //this.map.removeActorInStage((BaseActors)this.instruccions.get(this.instruccions.));
        Utils.showMessage("pos: "+this.posInstruction);
        Utils.showMessage("size:" + this.instruccions.size());

        this.posInstruction=0;


         /*tAry {
            // Utils.showMessage("utilssssss");
             t.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }*/
         this.map.setInputProcessor(this.map.getHero());
    }

   @Override
    synchronized public boolean keyDown(int keycode) {

        switch (keycode){
            case Config.BUTTON_A:
               /* Utils.showMessage("pos: "+this.posInstruction);
                Utils.showMessage("size:" + this.instruccions.size());
                if(this.posInstruction<=this.instruccions.size()-1){

                    if(this.instruccions.get(this.posInstruction) instanceof Draw){
                        this.map.addDrawEvent((Draw)this.instruccions.get(this.posInstruction));
                    }
                    if(this.instruccions.get(this.posInstruction) instanceof Action){
                        this.map.removeActorInStage((BaseActors)this.instruccions.get(this.posInstruction-1));
                        ((Action)this.instruccions.get(this.posInstruction)).make();
                    }
                    this.posInstruction++;
                }
                if(this.posInstruction>this.instruccions.size()){
                    this.desactive();
                }
                if(this.posInstruction==this.instruccions.size()){
                    this.posInstruction++;
                }*/
                this.pauseEvent=true;
                break;
        }


        Utils.showMessage("tecla: "+keycode);

        return true;
    }


    @Override
     public void run() {
       Utils.showMessage("pos: "+this.posInstruction);
        Utils.showMessage("size:" + this.instruccions.size());

        for (int i=0; i<this.instruccions.size();i++){
            if(this.instruccions.get(this.posInstruction) instanceof Draw){
                this.map.addDrawEvent((Draw)this.instruccions.get(this.posInstruction));
                pauseEvent=false;
               do{
                    Gdx.input.isKeyPressed(Input.Keys.A);
                    //aaaUtils.showMessage("hellooooo");
                    //Gdx.input.isButtonPressed(Input.Keys.A);
                } while(!pauseEvent);
                    pauseEvent=false;
            }
            if(this.instruccions.get(this.posInstruction) instanceof Action){
                if(this.posInstruction>1) {
                    if (this.instruccions.get(this.posInstruction - 1).getClass().getInterfaces()[0].getSimpleName().equals("Draw")) {
                        this.map.removeActorInStage((BaseActors) this.instruccions.get(this.posInstruction - 1));
                    }
                }
                Utils.showMessage(this.instruccions.get(this.posInstruction).getClass().getSimpleName());
                if(this.instruccions.get(this.posInstruction).getClass().getSimpleName().contains("Move")) {
                    try {
                        Thread.sleep(300);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ((Action)this.instruccions.get(this.posInstruction)).make();
            }
            Utils.showMessage("element:"+i);
            this.posInstruction++;
        }

        desactive();

    }
}
