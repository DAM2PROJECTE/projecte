package game.pokemon.Engine.Events.ElementEvents;

import game.pokemon.Engine.Actors.Character;
import game.pokemon.Engine.Events.Interfaces.Action;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;

/**
 * Created by marccat on 18/3/2018.
 */

public class SeeToRightEvent implements Action {

    private Character pers;

    public SeeToRightEvent(Character pers) {
        this.pers = pers;

    }


    @Override
    public void make() {
       pers.seeRight();
    }


}