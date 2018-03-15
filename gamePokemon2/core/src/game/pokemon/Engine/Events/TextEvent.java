package game.pokemon.Engine.Events;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;

import game.pokemon.Engine.Actors.BaseActors;
import game.pokemon.Engine.Actors.Still;
import game.pokemon.Engine.BaseScreen;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.Engine.Screens.MapScreen.Square;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 12/3/2018.
 */

public class TextEvent extends BaseActors {

    private Map<String,TextureRegion> parts;
    private String message;
    private BitmapFont font;


    public TextEvent( Texture img, String message) {
        super(img);
        this.img=img;
        this.parts = new HashMap<String, TextureRegion>();
        TextEvent.TAG="TextEvent";
        getInstanceElements();
        this.message = message;
        font = new BitmapFont();
    }

    public void getInstanceElements(){
       /*parts = new TextureRegion(this.img,
                0*this.map.config.getPixelsCharacterWith(),0*this.map.config.getPixelsCharacterHeight(),
                this.map.config.getPixelsCharacterWith(),this.map.config.getPixelsCharacterHeight());*/
        parts.put("EsquerreDalt",new TextureRegion(this.img,0,0,26,16));
        parts.put("EsquerreMig",new TextureRegion(this.img,0,16,26,16));
        parts.put("EsquerreBaix",new TextureRegion(this.img,0,32,26,16));
        parts.put("CentralEsquerreDalt",new TextureRegion(this.img,26,0,6,16));
        parts.put("CentralEsquerreBaix",new TextureRegion(this.img,26,32,6,16));
        parts.put("CentralDalt",new TextureRegion(this.img,32,0,16,16));
        parts.put("CentralBaix",new TextureRegion(this.img,32,32,16,16));
        parts.put("CentralDretDalt",new TextureRegion(this.img,42,0,6,16));
        parts.put("CentralDretBaix",new TextureRegion(this.img,42,32,6,16));
        parts.put("DretDalt",new TextureRegion(this.img,48,0,42,16));
        parts.put("DretMig",new TextureRegion(this.img,48,16,42,16));
        parts.put("DretBaix",new TextureRegion(this.img,48,32,42,16));


    }


   /* @Override
    public void active() {
        /*TextureRegion[] partsText = (TextureRegion[]) this.parts.values().toArray();
        for (int  i=0; i<=partsText.length-1;i++){
            this.map.
        }*/
        //this.map.activeEvents(this);
        //addElementEvent(this);
    /*}

    @Override
    public void desactive() {

    }*/

    @Override
    public void draw(Batch batch, float parentAlpha) {
        //super.draw(sprite,this.StillPosX*Square.WITH,this.StillPosY*Square.HEIGT);

       ShapeRenderer shapeRenderer;
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(batch.getProjectionMatrix());
        batch.end();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.rect(10, 10, 480, 80);
        shapeRenderer.end();

        batch.begin();
        font.setColor(0.0f, 0.0f, 0.0f, 1.0f);
        //font.getData().setScale(13,10);
        font.draw(batch, this.message,40,70);
        batch.draw(this.parts.get("EsquerreBaix"),4,2);
        int avaibleHeight = 4;
        int valorheight =16;
        /*for (int  i=1; i<(avaibleHeight)+1;i++){

            batch.draw(this.parts.get("EsquerreMig"),4,i*valorheight+2);
            Utils.showMessage(i*valorheight+2+"");
        }*/
        batch.draw(this.parts.get("EsquerreMig"),4,16+2);
        batch.draw(this.parts.get("EsquerreMig"),4,32+2);
        batch.draw(this.parts.get("EsquerreMig"),4,48+2);
        batch.draw(this.parts.get("EsquerreMig"),4,64+2);
        batch.draw(this.parts.get("EsquerreDalt"),4,82);
        batch.draw(this.parts.get("CentralEsquerreDalt"),26+4,82);
        batch.draw(this.parts.get("CentralEsquerreBaix"),26+4,2);

        avaibleHeight = 27;
        valorheight =16;
        for (int  i=1; i<(avaibleHeight)+1;i++){

            batch.draw(this.parts.get("CentralDalt"),16+i*valorheight+4,82);
            batch.draw(this.parts.get("CentralBaix"),16+i*valorheight+4,2);
        }
        batch.draw(this.parts.get("CentralDretDalt"),16+27*valorheight+4,82);
        batch.draw(this.parts.get("CentralDretBaix"),16+27*valorheight+4,2);
        batch.draw(this.parts.get("DretDalt"),16+27*valorheight+4+6,82);
        batch.draw(this.parts.get("DretMig"),16+27*valorheight+4+6,16+2);
        batch.draw(this.parts.get("DretMig"),16+27*valorheight+4+6,32+2);
        batch.draw(this.parts.get("DretMig"),16+27*valorheight+4+6,48+2);
        batch.draw(this.parts.get("DretMig"),16+27*valorheight+4+6,64+2);
        batch.draw(this.parts.get("DretDalt"),16+27*valorheight+4+6,82);
        batch.draw(this.parts.get("DretBaix"),16+27*valorheight+4+6,2);
        batch.draw(this.parts.get("DretBaix"),16+27*valorheight+4+6,2);


    }




}


