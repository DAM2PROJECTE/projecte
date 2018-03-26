package game.pokemon.Engine.Events.ElementEvents;

import game.pokemon.Engine.Actors.Character;
import game.pokemon.Engine.Events.Interfaces.Action;

/**
 * Created by marccat on 18/3/2018.
 */

public class SeeToLeftEvent implements Action {

    private Character pers;

    public SeeToLeftEvent(Character pers) {
        this.pers = pers;

    }


    @Override
    public void make() {
       pers.seeLeft();
    }


}