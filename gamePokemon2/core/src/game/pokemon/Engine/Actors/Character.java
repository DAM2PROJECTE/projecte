package game.pokemon.Engine.Actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;

/**
 * Created by marccat on 10/3/2018.
 */

public class Character extends Still{

    protected MapScreen map;
    protected int characterPosX;
    protected int characterPosY;
    protected String name_position;


    public Character(Texture img, MapScreen map, int characterPosX, int characterPosY) {
        super(img, null);
        this.map = map;
        this.characterPosX = characterPosX;
        this.characterPosY = characterPosY;
        sprite = new TextureRegion(this.img,
                0*this.map.config.getPixelsCharacterWith(),0*this.map.config.getPixelsCharacterHeight(),
                this.map.config.getPixelsCharacterWith(),this.map.config.getPixelsCharacterHeight());
        this.name_position = "SeeDown0";

    }

    public Character(Texture img, MapScreen map) {
        super(img, null);
        this.map = map;
        this.characterPosX = 0;
        this.characterPosY = 0;
        sprite = new TextureRegion(this.img,
                0*this.map.config.getPixelsCharacterWith(),0*this.map.config.getPixelsCharacterHeight(),
                this.map.config.getPixelsCharacterWith(),this.map.config.getPixelsCharacterHeight());
        this.name_position = "SeeDown0";
    }

}
