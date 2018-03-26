package game.pokemon.Engine.Actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.HashMap;
import java.util.Map;

import game.pokemon.Engine.Screens.MapScreen.Square;

/**
 * Created by marccat on 24/3/2018.
 */

public class AutoStill extends Still {
    private Map<Integer,TextureRegion> flower;
    private float posflower;


    public AutoStill(Texture img) {
        super(img);
        flower = new HashMap<Integer, TextureRegion>();
        instanceElements();
        this.posflower = 1f;
        this.sprite = flower.get((int)this.posflower);
    }

    public void instanceElements(){
       /*parts = new TextureRegion(this.img,
                0*this.map.config.getPixelsCharacterWith(),0*this.map.config.getPixelsCharacterHeight(),
                this.map.config.getPixelsCharacterWith(),this.map.config.getPixelsCharacterHeight());*/

        flower.put(1,new TextureRegion(this.img,0,0, Square.WITH,Square.HEIGT));
        flower.put(2,new TextureRegion(this.img,32,0,Square.WITH,Square.HEIGT));
        flower.put(3,new TextureRegion(this.img,64,0,Square.WITH,Square.HEIGT));
        flower.put(4,new TextureRegion(this.img,96,0,Square.WITH,Square.HEIGT));


    }


    @Override
    synchronized public void act(float delta) {
        super.act(delta);
        if (posflower >= this.flower.size()) {
            posflower=1;
        }else{
            posflower +=0.05f;
            this.sprite = this.flower.get((int)posflower);
        }

    }
}
