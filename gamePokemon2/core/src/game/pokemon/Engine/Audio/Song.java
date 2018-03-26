package game.pokemon.Engine.Audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marccat on 25/3/2018.
 */

public class Song {

    private static Song audio;

    private Map<String,Music> songs;

    private Song(){
        this.songs = new HashMap<String,Music>();
        songs.put("DoorExit", Gdx.audio.newMusic(Gdx.files.internal("music/Door_exit.ogg")));
    }

    public Music getMusic(String idSong){
        return songs.get(idSong);
    }

    public static  Song getInstanceManagement(){
        if(audio==null){
            audio = new Song();
        }
        return audio;
    }
}
