package game.pokemon.Engine.Actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by marccat on 10/3/2018.
 */

public abstract class BaseActors extends Actor {
    protected Texture img;

    public BaseActors(Texture img) {
        this.img = img;
    }
}
