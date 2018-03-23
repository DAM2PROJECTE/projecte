package game.pokemon.Engine.Events.ElementEvents;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

import game.pokemon.Engine.Actors.BaseActors;
import game.pokemon.Engine.Events.Interfaces.Action;
import game.pokemon.Engine.Actors.Character;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;

/**
 * Created by marccat on 16/3/2018.
 */

public class MoveToDownEvent implements Action {
    private MapScreen map;
    private Character pers;

    public MoveToDownEvent(Character pers, MapScreen map) {
        this.pers = pers;
        this.map = map;
    }


    @Override
    public void make() {
        if(this.map.isSquareAvaible(pers.getActorPosX()+""+pers.getActorPosY())) {
            pers.setActorPosY(pers.getActorPosY() - 1);
        }
    }


}
