package game.pokemon.Engine.Screens.MapScreen;

import game.pokemon.Engine.Actors.Still;
import game.pokemon.Engine.BaseScreen;
import game.pokemon.Engine.Events.Event;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 10/3/2018.
 */

public class Square {
    public static final int WITH = BaseScreen.config.getPixelsSquareWith();
    public static final int HEIGT = BaseScreen.config.getPixelsSquareHeight();

    public enum Level
    {
        SMALL,HALF,TALL;
    }


    private int squarePosX;
    private int squarePosY;

    private Still small;
    private Still half;
    private Still tall;

    private Event event;


    public Square(int squarePosX, int squarePosY, Still small, Still half, Still tall) {
        this.squarePosX = squarePosX;
        this.squarePosY = squarePosY;
        this.small = small;
        this.small.setStillPosX(this.squarePosX);
        this.small.setStillPosY(this.squarePosY);
        this.half = half;
        this.half.setStillPosX(this.squarePosX);
        this.half.setStillPosY(this.squarePosY);
        this.tall = tall;
        this.tall.setStillPosX(this.squarePosX);
        this.tall.setStillPosY(this.squarePosY);
    }
    public Square(int squarePosX, int squarePosY) {
        this.squarePosX = squarePosX;
        this.squarePosY = squarePosY;
        this.small=null;
        this.half=null;
        this.tall=null;
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
    public int getSquarePosX() {
        return squarePosX;
    }
    public int getSquarePosY() {
        return squarePosY;
    }

    public void setSmall(Still small) {
        this.small = small;
        this.small.setStillPosX(this.squarePosX);
        this.small.setStillPosY(this.squarePosY);
    }
    public void setHalf(Still half) {
        this.half = half;
        this.half.setStillPosX(this.squarePosX);
        this.half.setStillPosY(this.squarePosY);
    }
    public void setTall(Still tall) {
        this.tall = tall;
        this.tall.setStillPosX(this.squarePosX);
        this.tall.setStillPosY(this.squarePosY);
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public void setSquarePosX(int squarePosX) {
        this.squarePosX = squarePosX;
    }
    public void setSquarePosY(int squarePosY) {
        this.squarePosY = squarePosY;
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

    public void doEvent(){
        if(this.event!=null){
            Utils.showMessage("Executant Event");
            this.event.active();
        }else{
            Utils.showMessage("Aquesta casella no te Event");
        }
    }
}
