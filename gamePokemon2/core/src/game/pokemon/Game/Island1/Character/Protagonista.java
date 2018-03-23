package game.pokemon.Game.Island1.Character;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.pokemon.Engine.Actors.Hero;
import game.pokemon.Engine.Config;

import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 10/3/2018.
 */

public class Protagonista  extends Hero{

    public Protagonista(Texture img, MapScreen map, int characterPosX, int characterPosY) {
        super(img, map, characterPosX, characterPosY);
    }
    public Protagonista(Texture img, MapScreen map) {
        super(img, map);
    }


    public void seeUp(){
        this.sprite = new TextureRegion(this.img,0,3*48, 32,48);
    }

    public void seeDown(){
        this.sprite = new TextureRegion(img,0,0, 32,48);
    }

    public void seeLeft(){
        this.sprite = new TextureRegion(img,0,1*48, 32,48);
    }

    public void seeRight(){
        this.sprite = new TextureRegion(img,0,2*48, 32,48);
    }

    @Override
    public boolean keyDown(int keycode) {

        switch(keycode) {

            case Config.BUTTON_ARROW_UP:
                if(this.map.isSquareAvaible(this.actorPosX+""+(this.actorPosY+1))){
                    this.actorPosY += 1;
                    //this.map.move(0,-1);
                }
                this.name_position="SeeUp0";
                this.sprite = new TextureRegion(this.img,0,3*48, 32,48);
                break;

            case Config.BUTTON_ARROW_DOWN:
                if(this.map.isSquareAvaible(this.actorPosX+""+(this.actorPosY-1))){
                    this.actorPosY-=1;
                    //this.map.move(0,+1);

                }
                this.name_position="SeeDown0";
                this.sprite = new TextureRegion(img,0,0, 32,48);
                break;

            case Config.BUTTON_ARROW_LEFT:
                if(this.map.isSquareAvaible(this.actorPosX-1+""+this.actorPosY)){

                    this.actorPosX-=1;
                    //this.map.move(+1,0);

                }
                this.name_position="SeeLeft0";
                this.sprite = new TextureRegion(img,0,1*48, 32,48);
                break;

            case Config.BUTTON_ARROW_RIGHT:
                if(this.map.isSquareAvaible(this.actorPosX+1+""+this.actorPosY)){

                    this.actorPosX+=1;
                    //this.map.move(-1,0);

                }
                this.name_position="SeeRight0";
                this.sprite = new TextureRegion(img,0,2*48, 32,48);
                break;

            case Config.BUTTON_A:
                executeEvent();
                break;

        }

        Utils.showMessage("Tecla pulsada:"+keycode);
        Utils.showMessage("mapa :"+this.map.getClass().getName());
        return true;
    }


}
