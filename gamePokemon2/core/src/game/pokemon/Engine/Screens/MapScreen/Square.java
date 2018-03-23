package game.pokemon.Engine.Screens.MapScreen;

import java.util.ArrayList;

import game.pokemon.Engine.Actors.Still;
import game.pokemon.Engine.BaseScreen;
import game.pokemon.Engine.Events.Event;

/**
 * Created by marccat on 10/3/2018.
 */

public class Square {
    public static final int WITH = BaseScreen.config.getPixelsSquareWith();
    public static final int HEIGT = BaseScreen.config.getPixelsSquareHeight();

    public boolean doEvent(int pos) {
        return  event.get(pos).active();
    }

    public void setEvent(Event event) {
        this.event.add(event);
    }

    public enum Level
    {
        SMALL,HALF,TALL;
    }

    private int squarePosX;
    private int squarePosY;

    private Still small;
    private Still half;
    private Still tall;

    public ArrayList<Event> getEvent() {
        return event;
    }

    private ArrayList<Event> event;
    //private ArrayList<Event> StoryEvent;
    public Square(int squarePosX, int squarePosY, Still small, Still half, Still tall) {
        this.squarePosX = squarePosX;
        this.squarePosY = squarePosY;
        this.small = small;
        this.small.setActorPosX(this.squarePosX);
        this.small.setActorPosY(this.squarePosY);
        this.half = half;
        this.half.setActorPosX(this.squarePosX);
        this.half.setActorPosY(this.squarePosY);
        this.tall = tall;
        this.tall.setActorPosX(this.squarePosX);
        this.tall.setActorPosY(this.squarePosY);
        this.event = new ArrayList<Event>();
    }

    public Square(int squarePosX, int squarePosY) {
        this.squarePosX = squarePosX;
        this.squarePosY = squarePosY;
        this.small=null;
        this.half=null;
        this.tall=null;
        this.event = new ArrayList<Event>();
    }


    public Still getSmall() {
        return small;
    }
    public Still getHalf() {
        return half;
    }
    public Still getTall() {
        return tall;
    }


    public void setSmall(Still small) {
        this.small = small;
        this.small.setActorPosX(this.squarePosX);
        this.small.setActorPosY(this.squarePosY);
    }
    public void setHalf(Still half) {
        this.half = half;
        this.half.setActorPosX(this.squarePosX);
        this.half.setActorPosY(this.squarePosY);
    }
    public void setTall(Still tall) {
        this.tall = tall;
        this.tall.setActorPosX(this.squarePosX);
        this.tall.setActorPosY(this.squarePosY);
    }

    @Override
    public boolean equals(Object obj){
        boolean iguals=false;
        if(obj == null){
            iguals=false;
        }else{
            if(obj == this){
                iguals = true;
            }else if(obj.getClass() != this.getClass()){
                iguals = false;
            }else{
                Square c = (Square) obj;
                if(this.squarePosX == this.squarePosX && this.squarePosY==this.squarePosY){
                    iguals=true;
                }else{
                    iguals=false;
                }
            }
        }

        return iguals;
    }

    @Override
    public int hashCode() {
        int result =7;
        result = 31 * result + squarePosX;
        result = 31 * result + squarePosY;
        return result;
    }


}
