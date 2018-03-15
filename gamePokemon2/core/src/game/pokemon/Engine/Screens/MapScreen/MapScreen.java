package game.pokemon.Engine.Screens.MapScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import game.pokemon.Engine.Actors.BaseActors;
import game.pokemon.Engine.Actors.Character;
import game.pokemon.Engine.Actors.Hero;
import game.pokemon.Engine.Actors.Still;
import game.pokemon.Engine.BaseScreen;
import game.pokemon.Engine.Events.Event;
import game.pokemon.Main;
import game.pokemon.System.Dates.ManagementSprite;
import game.pokemon.System.Exception.NotTwoHeroException;
import game.pokemon.System.Exception.SquareNotAvaible;
import game.pokemon.System.Exception.SquareNotFound;
import game.pokemon.System.Utils.Utils;

import static com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.square;

/**
 * Created by marccat on 10/3/2018.
 */

public abstract class MapScreen extends BaseScreen {

    protected Hero hero;
    protected ManagementSprite ms;
    private Map<String,Square> squares;
    private ArrayList<Character> characters;

    public MapScreen(Main game) {
        super(game);
        ms = new ManagementSprite(new Texture("Outside.png"));
        squares = new HashMap<String,Square>();
        characters = new ArrayList<Character>();
    }

    @Override
    public void show() {
        super.show();

        getsInstancedStage();

        includeTextureSmall();
        includeTextureHalf();
        includeCharacters();
        includeTextureTall();
        includeEvents();

    }


    protected void addSquare(Still still, int posX, int posY, Square.Level level ){
        //System.out.println("estic a add casella");
        addActorInStage(still);
        Square square;
        if(this.squares.containsKey(posX+""+posY)){
            square = this.squares.get(posX+""+posY);
        }else{
            square = new Square(posX,posY);
            this.squares.put(posX+""+posY,square);
        }

        switch (level){

            case SMALL:
                square.setSmall(still);
                break;
            case HALF:
                square.setHalf(still);
                break;
            case TALL:
                square.setTall(still);
                break;
        }

    }
    protected void addHero(Hero hero, int squarePosX, int squarePosY){

        if(this.hero!=null){
           throw new  NotTwoHeroException();
        }
        if(this.squares.get(squarePosX+""+squarePosY)==null){
            throw new SquareNotFound();
        }else if(this.squares.get(squarePosX+""+squarePosY).getHalf()!=null){
           throw new SquareNotAvaible("This Square with  XY:"+squarePosX+""+squarePosY+" constains a element.");
        }

        this.hero = hero;

        this.hero.setStillPosX(squarePosX);
        this.hero.setStillPosY(squarePosY);
        setInputProcessor(hero);
        addActorInStage(hero);

    }
    protected void addCharacter(Character character, int squarePosX, int squarePosY){
        /*if(this.hero!=null){
            throw new  NotTwoHeroException();
        }*/
        if(this.squares.get(squarePosX+""+squarePosY)==null){
            throw new SquareNotFound();
        }else if(this.squares.get(squarePosX+""+squarePosY).getHalf()!=null){
            throw new SquareNotAvaible("This Square with  XY:"+squarePosX+""+squarePosY+" constains a element.");
        }
        this.squares.get(squarePosX+""+squarePosY).setHalf(character);
        character.setStillPosX(squarePosX);
        character.setStillPosY(squarePosY);
        this.characters.add(character);
        addActorInStage(character);

    }
    protected void addEvent(Event event, int squarePosX, int squarePosY){
        if(this.squares.get(squarePosX+""+squarePosY)==null){
            throw new SquareNotFound();
        }
        this.squares.get(squarePosX+""+squarePosY).setEvent(event);
    }
    public void addImgEvent(BaseActors actor){
        addActorInStage(actor);
    }


    public boolean isSquareAvaible(String idSquare){
        if(this.squares.get(idSquare)==null){
            throw new SquareNotFound();
        }else if(this.squares.get(idSquare).getHalf()!=null){
            return false;
        }else {
            return true;
        }
    }
    public void doEventSquare(String idSquare){
        if(this.squares.get(idSquare)==null){
            throw new SquareNotFound();
        }
        this.squares.get(idSquare).doEvent();
        Utils.showMessage("casella comporbada: "+idSquare);
        Utils.showMessage("Hero:"+this.hero.getActorPosX()+this.hero.getActorPosY());
    }



    /*public void move(int x, int y){
        Iterator it = this.squares.keySet().iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            squares.get(key).setSquarePosY(squares.get(key).getSquarePosY()+y);
            squares.get(key).setSquarePosX(squares.get(key).getSquarePosX()+x);
        }

       Array acs = this.stage.getActors();
        for (int i=0; i<acs.size;i++){
            if(acs.get(i) instanceof Inmobil) {
                Inmobil o = (Inmobil) acs.get(i);
                o.setCasellaPosicioY(o.getCasellaPosicioY() + y);
                o.setCasellaPosicioX(o.getCasellaPosicioX() + x);
            }
        }
    }*/


    protected abstract void includeTextureSmall();
    protected abstract void includeTextureHalf();
    protected abstract void includeTextureTall();
    protected abstract void includeCharacters();
    protected abstract void includeEvents();

    public void activeEvents(Event event){
        addActorInStage(event);
        if(event instanceof InputProcessor) {
            Gdx.input.setInputProcessor(event);
        }
        //this.stage.addActor(event);
    }
    public void desactiveEvents(Event event){
        removeActorInStage(event);
        Gdx.input.setInputProcessor(this.hero);
    }
}
