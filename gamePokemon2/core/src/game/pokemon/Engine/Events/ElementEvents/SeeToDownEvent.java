package game.pokemon.Engine.Events.ElementEvents;

import game.pokemon.Engine.Actors.Character;
import game.pokemon.Engine.Events.Interfaces.Action;

/**
 * Created by marccat on 18/3/2018.
 */

public class SeeToDownEvent implements Action {

    private Character pers;

    public SeeToDownEvent(Character pers) {
        this.pers = pers;

    }


    @Override
    public void make() {
       pers.seeDown();
    }


}