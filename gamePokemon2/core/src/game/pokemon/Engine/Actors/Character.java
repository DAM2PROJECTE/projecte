package game.pokemon.Engine.Actors;


import com.badlogic.gdx.graphics.Texture;

import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Engine.Screens.MapScreen.Square;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


/**
 * Created by marccat on 10/3/2018.
 */

public class Character extends Still{

    public void setMap(MapScreen map) {
        this.map = map;
    }

    protected MapScreen map;

   /* public int getCharacterPosX() {
        return characterPosX;
    }

    public int getCharacterPosY() {
        return characterPosY;
    }

    public void setCharacterPosX(int characterPosX) {
        this.characterPosX = characterPosX;
    }

    public void setCharacterPosY(int characterPosY) {
        this.characterPosY = characterPosY;
    }*/

    public String getName_position() {
        return name_position;
    }

    /* protected int characterPosX;
        protected int characterPosY;*/
    protected String name_position;


    public Character(Texture img, MapScreen map, int characterPosX, int characterPosY) {
        super(img, null);
        this.map = map;
        this.actorPosX = characterPosX;
        this.actorPosY = characterPosY;
        sprite = new TextureRegion(this.img,
                0*this.map.config.getPixelsCharacterWith(),0*this.map.config.getPixelsCharacterHeight(),
                this.map.config.getPixelsCharacterWith(),this.map.config.getPixelsCharacterHeight());
        this.name_position = "SeeDown0";

    }

    public Character(Texture img, MapScreen map) {
        super(img, null);
        this.map = map;
        this.actorPosX =0;
        this.actorPosY =0;
        sprite = new TextureRegion(this.img,
                0*this.map.config.getPixelsCharacterWith(),0*this.map.config.getPixelsCharacterHeight(),
                this.map.config.getPixelsCharacterWith(),this.map.config.getPixelsCharacterHeight());
        this.name_position = "SeeDown0";
    }

   /* @Override
    public void draw(Batch batch, float parentAlpha) {
        //super.draw(sprite,this.StillPosX*Square.WITH,this.StillPosY*Square.HEIGT);
        batch.draw(sprite,this.characterPosX* Square.WITH,this.characterPosY
                *Square.HEIGT);

    }*/
   public void seeUp(){
      // this.sprite = new TextureRegion(this.img,0,3*48, 32,48);
   }

    public void seeDown(){
        //this.sprite = new TextureRegion(img,0,0, 32,48);
    }

    public void seeLeft(){
       // this.sprite = new TextureRegion(img,0,1*48, 32,48);
    }

    public void seeRight(){
        //this.sprite = new TextureRegion(img,0,2*48, 32,48);
    }

}
