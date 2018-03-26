package game.pokemon.Engine.Audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marccat on 25/3/2018.
 */

public class Effect {
    public static final String DOOR_EXIT = "DoorExit";


    private static Effect audio;

    private Map<String,Music> sound;

    private Effect(){
        this.sound = new HashMap<String,Music>();
        sound.put("DoorExit", Gdx.audio.newMusic(Gdx.files.internal("music/Door_exit.ogg")));
    }

    /*public Music getMusic(String idSong){
        return songs.get(idSong);
    }*/

    public static Effect getInstanceManagement(){
        if(audio==null){
            audio = new Effect();
        }
        return audio;
    }

    public void play(String ideffect){
        sound.get(ideffect).setLooping(false);
        sound.get(ideffect).setVolume(0.3f);
        sound.get(ideffect).play();
    }

}
