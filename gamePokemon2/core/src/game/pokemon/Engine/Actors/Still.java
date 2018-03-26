package game.pokemon.Engine.Actors;

/**
 * Created by marccat on 10/3/2018.
 */
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.pokemon.Engine.Screens.MapScreen.Square;

public class Still extends BaseActors {
    protected TextureRegion sprite;

    protected int actorPosX;

    public int getActorPosX() {
        return actorPosX;
    }

    public int getActorPosY() {
        return actorPosY;
    }

    public void setActorPosX(int actorPosX) {
        this.actorPosX = actorPosX;
    }

    public void setActorPosY(int actorPosY) {
        this.actorPosY = actorPosY;
    }

    protected int actorPosY;

    public Still(TextureRegion sprite) {
        super(null);
        this.sprite = sprite;
    }

    public Still(Texture img) {
        super(img);
    }

    public Still(Texture img, TextureRegion sprite) {
        super(img);
        this.sprite = sprite;
    }

    @Override
    synchronized public void draw(Batch batch, float parentAlpha) {
        //super.draw(sprite,this.StillPosX*Square.WITH,this.StillPosY*Square.HEIGT);
        batch.draw(sprite,this.actorPosX*Square.WITH,this.actorPosY*Square.HEIGT);

    }
}
