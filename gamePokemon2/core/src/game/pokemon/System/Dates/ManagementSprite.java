package game.pokemon.System.Dates;

/**
 * Created by marccat on 10/3/2018.
 */
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.HashMap;
import java.util.Map;




public class ManagementSprite {

    private static ManagementSprite management;

    private Texture Outside;
    private Texture InteriorGeneral;

    private Map<String,TextureRegion> tiles = new HashMap<String,TextureRegion>();


    private ManagementSprite() {
        this.Outside = new Texture("Outside.png");
        this.InteriorGeneral = new Texture("Interior_general.png");
        this.tiles = new HashMap<String,TextureRegion>();
        this.tiles.put("herba1",new TextureRegion(Outside,32*1,32*0,32,32));
        this.tiles.put("arbre_esquerre_mitja_ombra",new TextureRegion(Outside,32*2,32*53,32,32));
        this.tiles.put("arbre_dret_mitja_ombra",new TextureRegion(Outside,32*3,32*53,32,32));
        this.tiles.put("arbre_esquerre_mitja",new TextureRegion(Outside,32*0,32*53,32,32));
        this.tiles.put("arbre_dret_mitja",new TextureRegion(Outside,32*1,32*53,32,32));
        this.tiles.put("arbre_esquerre_dalt_sup",new TextureRegion(Outside,32*2,32*52,32,32));
        this.tiles.put("arbre_dret_dalt_sup",new TextureRegion(Outside,32*3,32*52,32,32));
        this.tiles.put("arbre_esquerre_dalt_vuit",new TextureRegion(Outside,32*4,32*52,32,32));
        this.tiles.put("arbre_dret_dalt_vuit",new TextureRegion(Outside,32*5,32*52,32,32));
        this.tiles.put("arbre_esquerre_baix",new TextureRegion(Outside,32*2,32*54,32,32));
        this.tiles.put("arbre_dret_baix",new TextureRegion(Outside,32*3,32*54,32,32));
        this.tiles.put("cartelito",new TextureRegion(Outside,32*1,32*119,32,32));


        this.tiles.put("teulada_dalt1",new TextureRegion(Outside,32*0,32*197,32,32));
        this.tiles.put("teulada_dalt2",new TextureRegion(Outside,32*1,32*197,32,32));
        this.tiles.put("teulada_dalt3",new TextureRegion(Outside,32*2,32*197,32,32));
        this.tiles.put("teulada_dalt4",new TextureRegion(Outside,32*3,32*197,32,32));
        this.tiles.put("teulada_dalt5",new TextureRegion(Outside,32*4,32*197,32,32));
        this.tiles.put("teulada_centrat1",new TextureRegion(Outside,32*0,32*198,32,32));
        this.tiles.put("teulada_centrat2",new TextureRegion(Outside,32*1,32*198,32,32));
        this.tiles.put("teulada_centrat3",new TextureRegion(Outside,32*2,32*198,32,32));
        this.tiles.put("teulada_centrat4",new TextureRegion(Outside,32*3,32*198,32,32));
        this.tiles.put("teulada_centrat5",new TextureRegion(Outside,32*4,32*198,32,32));
        this.tiles.put("teulada_baix1",new TextureRegion(Outside,32*0,32*199,32,32));
        this.tiles.put("teulada_baix2",new TextureRegion(Outside,32*1,32*199,32,32));
        this.tiles.put("teulada_baix3",new TextureRegion(Outside,32*2,32*199,32,32));
        this.tiles.put("teulada_baix4",new TextureRegion(Outside,32*3,32*199,32,32));
        this.tiles.put("teulada_baix5",new TextureRegion(Outside,32*4,32*199,32,32));
        this.tiles.put("casa_mig1",new TextureRegion(Outside,32*0,32*200,32,32));
        this.tiles.put("casa_mig2",new TextureRegion(Outside,32*1,32*200,32,32));
        this.tiles.put("casa_mig3",new TextureRegion(Outside,32*2,32*200,32,32));
        this.tiles.put("casa_mig4",new TextureRegion(Outside,32*3,32*200,32,32));
        this.tiles.put("casa_mig5",new TextureRegion(Outside,32*4,32*200,32,32));
        this.tiles.put("casa_baix1",new TextureRegion(Outside,32*0,32*201,32,32));
        this.tiles.put("casa_baix2",new TextureRegion(Outside,32*1,32*201,32,32));
        this.tiles.put("casa_baix3",new TextureRegion(Outside,32*2,32*201,32,32));
        this.tiles.put("casa_baix4",new TextureRegion(Outside,32*3,32*201,32,32));
        this.tiles.put("casa_baix5",new TextureRegion(Outside,32*4,32*201,32,32));

        this.tiles.put("casa_terra",new TextureRegion(InteriorGeneral,32*0,32*59,32,32));
        this.tiles.put("entrada1",new TextureRegion(InteriorGeneral,32*5,32*107,32,32));
        this.tiles.put("entrada2",new TextureRegion(InteriorGeneral,32*6,32*107,32,32));
        this.tiles.put("entrada3",new TextureRegion(InteriorGeneral,32*7,32*107,32,32));
        this.tiles.put("entrada4",new TextureRegion(InteriorGeneral,32*5,32*108,32,32));
        this.tiles.put("entrada5",new TextureRegion(InteriorGeneral,32*6,32*108,32,32));
        this.tiles.put("entrada6",new TextureRegion(InteriorGeneral,32*7,32*108,32,32));
    }

    public static   ManagementSprite getInstanceManagement(){
        if(management==null){
            management = new ManagementSprite();
        }
        return management;
    }


    public TextureRegion GetTexture(String nom){
        return tiles.get(nom);
    }

   /*public TextureRegion setRegion(String nom){
        return tiles.get(nom);
    }*/


}
