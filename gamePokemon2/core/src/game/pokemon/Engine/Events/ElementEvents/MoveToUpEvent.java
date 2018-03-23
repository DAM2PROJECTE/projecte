package game.pokemon.Engine.Events.ElementEvents;

import game.pokemon.Engine.Actors.Character;
import game.pokemon.Engine.Events.Interfaces.Action;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;

/**
 * Created by marccat on 16/3/2018.
 */

public class MoveToUpEvent implements Action {
    private MapScreen map;
    private Character pers;

    public MoveToUpEvent(Character pers, MapScreen map) {
        this.pers = pers;
        this.map = map;
    }


    @Override
    public void make() {
        if(this.map.isSquareAvaible(pers.getActorPosX()+""+pers.getActorPosY())) {
            pers.setActorPosY(pers.getActorPosY() + 1);
        }
    }


}
