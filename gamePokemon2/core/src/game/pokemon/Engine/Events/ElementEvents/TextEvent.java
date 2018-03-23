package game.pokemon.Engine.Events.ElementEvents;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.HashMap;
import java.util.Map;

import game.pokemon.Engine.Actors.BaseActors;
import game.pokemon.Engine.Events.Interfaces.Draw;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.System.Dates.ManagementMessage;

/**
 * Created by marccat on 16/3/2018.
 */

public class TextEvent extends BaseActors implements Draw {

    private Map<String,TextureRegion> parts;
    private Map<Integer,TextureRegion> arrow;
    private Texture imgArrow;
    private TextureRegion showArrow;
    private float posArrow;
    private String message1;
    private String message2;
    private BitmapFont font;
    private MapScreen map;

    public TextEvent(Texture img,MapScreen map, String message1,String message2) {
        super(img);
        this.parts = new HashMap<String, TextureRegion>();
        this.arrow = new HashMap<Integer, TextureRegion>();
        this.imgArrow = new Texture("pause.png");
        this.posArrow=1;
        instanceElements();
        this.message1 = message1;
        this.message2 = message2;
        font = new BitmapFont();
        this.map = map;
        this.showArrow=this.arrow.get((int)posArrow);

    }



    public void instanceElements(){
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

        arrow.put(1,new TextureRegion(this.imgArrow,0,0,20,28));
        arrow.put(2,new TextureRegion(this.imgArrow,20,0,20,28));
        arrow.put(3,new TextureRegion(this.imgArrow,40,0,20,28));
        arrow.put(4,new TextureRegion(this.imgArrow,60,0,20,28));


    }


    @Override
    synchronized public void act(float delta) {
        super.act(delta);
        if (posArrow >= this.arrow.size()) {
            posArrow=1;
        }else{
            posArrow +=0.25f;
            this.showArrow = this.arrow.get((int)posArrow);
        }

    }

    @Override
    synchronized public void draw(Batch batch, float parentAlpha) {
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
        /*if (!this.map.getHero().getName_position().contains("Up")) {
            font.draw(batch, "no se puede leerde este lado", 40, 70);
        }else {
            font.draw(batch, this.message, 40, 70);
        }*/
        if(this.map.getHero().getName_position().contains("Up")) {
            font.draw(batch, this.message1, 40, 70);
            font.draw(batch, this.message2, 40, 40);
        }else{
            font.draw(batch, ManagementMessage.MESSAGE_CANT_READ, 40, 70);
        }
        batch.draw(this.parts.get("EsquerreBaix"),4,2);
        int avaibleHeight = 4;
        int valorheight =16;

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
        batch.draw(this.showArrow,16+27*valorheight+4+6+15,25);

    }






}
