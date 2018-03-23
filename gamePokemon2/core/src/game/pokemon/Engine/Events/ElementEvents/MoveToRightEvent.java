package game.pokemon.Engine.Events.ElementEvents;

import game.pokemon.Engine.Actors.Character;
import game.pokemon.Engine.Events.Interfaces.Action;
import game.pokemon.Engine.Screens.MapScreen.MapScreen;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 16/3/2018.
 */

public class MoveToRightEvent implements Action {
    private MapScreen map;
    private Character pers;

    public MoveToRightEvent(Character pers, MapScreen map) {
        this.pers = pers;
        this.map = map;
    }


    @Override
    public void make() {
        Utils.showMessage("pos personaje: "+pers.getActorPosX()+""+pers.getActorPosY());
        if(this.map.isSquareAvaible(pers.getActorPosX()+""+pers.getActorPosY())) {
            pers.setActorPosX(pers.getActorPosX() + 1);
        }
    }


}
