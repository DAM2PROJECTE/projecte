package game.pokemon.System.Dates;

/**
 * Created by marccat on 10/3/2018.
 */
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.HashMap;
import java.util.Map;


public class ManagementSprite {


    private Texture img;

    private Map<String,TextureRegion> tiles = new HashMap<String,TextureRegion>();


    public ManagementSprite(Texture img) {
        this.img = img;
        this.tiles = new HashMap<String,TextureRegion>();
        this.tiles.put("herba1",new TextureRegion(img,32*1,32*0,32,32));
        this.tiles.put("arbre_esquerre_mitja_ombra",new TextureRegion(img,32*2,32*53,32,32));
        this.tiles.put("arbre_dret_mitja_ombra",new TextureRegion(img,32*3,32*53,32,32));
        this.tiles.put("arbre_esquerre_mitja",new TextureRegion(img,32*0,32*53,32,32));
        this.tiles.put("arbre_dret_mitja",new TextureRegion(img,32*1,32*53,32,32));
        this.tiles.put("arbre_esquerre_dalt_sup",new TextureRegion(img,32*2,32*52,32,32));
        this.tiles.put("arbre_dret_dalt_sup",new TextureRegion(img,32*3,32*52,32,32));
        this.tiles.put("arbre_esquerre_dalt_vuit",new TextureRegion(img,32*4,32*52,32,32));
        this.tiles.put("arbre_dret_dalt_vuit",new TextureRegion(img,32*5,32*52,32,32));
        this.tiles.put("arbre_esquerre_baix",new TextureRegion(img,32*2,32*54,32,32));
        this.tiles.put("arbre_dret_baix",new TextureRegion(img,32*3,32*54,32,32));
        this.tiles.put("cartelito",new TextureRegion(img,32*1,32*119,32,32));

    }


    public TextureRegion GetTexture(String nom){
        return tiles.get(nom);
    }

   /*public TextureRegion setRegion(String nom){
        return tiles.get(nom);
    }*/


}
