package game.pokemon.Engine.Actors;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;

import game.pokemon.Engine.Screens.MapScreen.MapScreen;

/**
 * Created by marccat on 10/3/2018.
 */

public class Hero extends Character implements InputProcessor {

    public Hero(Texture img, MapScreen map, int characterPosX, int characterPosY) {
        super(img, map, characterPosX, characterPosY);
    }

    public Hero(Texture img, MapScreen map) {
        super(img, map );
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

    protected void executeEvent() {
        if(this.name_position.contains("Down")){
            this.map.doEventSquare(actorPosX+""+(actorPosY-1));
        }else if(this.name_position.contains("Up")){
            this.map.doEventSquare(actorPosX+""+(actorPosY+1));
        }else if(this.name_position.contains("Left")){
            this.map.doEventSquare((actorPosX-1)+""+actorPosY);
        }else if(this.name_position.contains("Right")){
            this.map.doEventSquare((actorPosX+1)+""+actorPosY);

        }
    }
}
