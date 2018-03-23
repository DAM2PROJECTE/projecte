package game.pokemon.Engine.Events;

import game.pokemon.Engine.Screens.MapScreen.MapScreen;

/**
 * Created by marccat on 16/3/2018.
 */

public abstract class StoryLine extends Event {
    private String state;


    public StoryLine(MapScreen map) {
        super(map);
    }
}
