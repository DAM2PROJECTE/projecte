package game.pokemon.Engine.Screens.MapScreen;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import game.pokemon.Engine.Actors.BaseActors;
import game.pokemon.Engine.Actors.Character;
import game.pokemon.Engine.Actors.Hero;
import game.pokemon.Engine.Actors.Still;
import game.pokemon.Engine.BaseScreen;
import game.pokemon.Engine.Events.Event;
import game.pokemon.Engine.Events.Interfaces.Draw;
import game.pokemon.Main;
import game.pokemon.System.Dates.ManagementSprite;
import game.pokemon.System.Exception.NotTwoHeroException;
import game.pokemon.System.Exception.SquareNotAvaible;
import game.pokemon.System.Exception.SquareNotFound;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 10/3/2018.
 */

public abstract class MapScreen extends BaseScreen {

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
        //setInputProcessor(hero);
    }


    protected Hero hero;
    protected ManagementSprite ms;
    private Map<String,Square> squares;
    private ArrayList<Character> characters;

    public MapScreen(Main game) {
        super(game);
        ms = ManagementSprite.getInstanceManagement();
        squares = new HashMap<String,Square>();
        Utils.showMessage(squares+"");
        characters = new ArrayList<Character>();
        getsInstancedStage();
    }

    @Override
    public void show() {
        //super.show();

        getsInstancedStage();
        this.squares.clear();
        includeTextureSmall();
        includeTextureHalf();
        includeCharacters();
        addHero(this.getHero(),this.getHero().getActorPosX(), this.getHero().getActorPosY());
        includeTextureTall();
        includeEvents();
        doStoryEventSquare(this.hero.getActorPosX()+""+this.hero.getActorPosY());

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
           //throw new  NotTwoHeroException();
        }
        if(this.squares.get(squarePosX+""+squarePosY)==null){
            throw new SquareNotFound();
        }else if(this.squares.get(squarePosX+""+squarePosY).getHalf()!=null){
           throw new SquareNotAvaible("This Square with  XY:"+squarePosX+""+squarePosY+" constains a element.");
        }

        this.hero = hero;

        this.hero.setActorPosX(squarePosX);
        this.hero.setActorPosY(squarePosY);
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
        character.setActorPosX(squarePosX);
        character.setActorPosY(squarePosY);
        this.characters.add(character);
        addActorInStage(character);

    }
    public boolean isSquareAvaible(String idSquare){
        Utils.showMessage("casella comporbada: " + idSquare);
        if(this.squares.get(idSquare)==null){
            return false;
        }else if(this.squares.get(idSquare).getHalf()!=null){
            return false;
        }else {
            return true;
        }


    }


    protected abstract void includeTextureSmall();
    protected abstract void includeTextureHalf();
    protected abstract void includeTextureTall();
    protected abstract void includeCharacters();
    protected abstract void includeEvents();


    public void doEventSquare(String idSquare){
        if(this.squares.get(idSquare)==null){
            throw new SquareNotFound();
        }
        boolean findEvent= false;
        Utils.showMessage("casella comporbada: " + idSquare);
        Utils.showMessage("Hero:" + this.hero.getActorPosX() + this.hero.getActorPosY());
        if(!this.squares.get(idSquare).getEvent().isEmpty()) {
            for (int i = 0; i > this.squares.get(idSquare).getEvent().size() || !findEvent; i++) {
            /*if(this.squares.get(idSquare).getEvent().get(i)!=null) {
                findEvent = this.squares.get(idSquare).doEvent(i);
            }*/
            /*this.squares.get(idSquare).doEvent(0)==false){
                this.squares.get(idSquare).doEvent(1);
            }*/
                findEvent = this.squares.get(idSquare).doEvent(i);


            }
        }

        /*if(this.squares.get(idSquare).doEvent(0)==false){
            this.squares.get(idSquare).doEvent(1);
        }*/

    }

    public void doStoryEventSquare(String idSquare){
        if(this.squares.get(idSquare)==null){
            throw new SquareNotFound();
        }
        boolean findEvent= false;
        Utils.showMessage("casella comporbada: " + idSquare);
        Utils.showMessage("Hero:" + this.hero.getActorPosX() + this.hero.getActorPosY());
        if(!this.squares.get(idSquare).getStoryEvent().isEmpty()) {
            for (int i = 0; i > this.squares.get(idSquare).getStoryEvent().size() || !findEvent; i++) {
            /*if(this.squares.get(idSquare).getEvent().get(i)!=null) {
                findEvent = this.squares.get(idSquare).doEvent(i);
            }*/
            /*this.squares.get(idSquare).doEvent(0)==false){
                this.squares.get(idSquare).doEvent(1);
            }*/
                findEvent = this.squares.get(idSquare).doStoryEvent(i);


            }
        }
    }

    public void addDrawEvent(Draw event){
        addActorInStage((BaseActors)event);
    }

    protected void addEvent(Event event, int squarePosX, int squarePosY){
        if(this.squares.get(squarePosX+""+squarePosY)==null){
            throw new SquareNotFound();
        }
        this.squares.get(squarePosX+""+squarePosY).setEvent(event);
    }
    protected void addStoryEvent(Event event, int squarePosX, int squarePosY){
        if(this.squares.get(squarePosX+""+squarePosY)==null){
            throw new SquareNotFound();
        }
        this.squares.get(squarePosX+""+squarePosY).setStoryEvent(event);
    }


}
