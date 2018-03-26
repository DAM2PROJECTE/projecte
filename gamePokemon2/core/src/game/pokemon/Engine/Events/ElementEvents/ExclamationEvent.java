package game.pokemon.Engine.Events.ElementEvents;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

import game.pokemon.Engine.Actors.BaseActors;
import game.pokemon.Engine.Events.Interfaces.Draw;

/**
 * Created by marccat on 16/3/2018.
 */

public class ExclamationEvent extends BaseActors implements Draw {

    public ExclamationEvent(Texture img) {
        super(img);
    }

    @Override
    public void  instanceElements() {

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }
}
