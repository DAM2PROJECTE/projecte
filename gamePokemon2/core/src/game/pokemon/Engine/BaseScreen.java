package game.pokemon.Engine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.Viewport;

import game.pokemon.Engine.Actors.Hero;
import game.pokemon.Main;
import game.pokemon.System.Utils.Utils;

/**
 * Created by marccat on 9/3/2018.
 */

public abstract class BaseScreen  implements Screen{

    protected Main game;
    public static Config config;
    private Stage stage;
    private OrthographicCamera camera;

    public BaseScreen(Main game) {
        this.game = game;
        this.camera = new OrthographicCamera();
        this.config = new Config();
        getsInstancedStage();

    }

    protected void getsInstancedStage(){
        this.stage = new Stage();
        this.stage.clear();
        Viewport vp = stage.getViewport();
        vp.setScreenSize(this.config.getWithGame(),this.config.getHeightGame());
        stage.setViewport(vp);
        OrthographicCamera camera = new OrthographicCamera();
        camera.setToOrtho(false);
        stage.getBatch().setProjectionMatrix(camera.view);
        stage.getViewport().update(this.config.getWithGame(),this.config.getHeightGame(), false);

    }

    protected void addActorInStage(Actor actor){
        this.stage.addActor(actor);
    }
    public void removeActorInStage(Actor actor){
        Utils.showMessage("buscant");
        for (int i = 0; i<=this.stage.getActors().size-1;i++){
            if(actor.equals(this.stage.getActors().get(i))){
                this.stage.getActors().get(i).remove();
                Utils.showMessage("boorat");
            }
        }

    }

    protected void activeEvents(){}
    protected void desactiveEvnts(){}

    public void setInputProcessor(InputProcessor listener){
        Gdx.input.setInputProcessor(listener);
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        this.stage.act();
        this.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        Viewport vp = stage.getViewport();
        //stage.clear();
        vp.setScreenSize(320,320);
        stage.setViewport(vp);
        ((OrthographicCamera)stage.getCamera()).setToOrtho(false);
        stage.getBatch().setProjectionMatrix(stage.getCamera().combined);
        System.out.println(Gdx.graphics.getWidth());
        System.out.println(Gdx.graphics.getHeight());
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        stage.dispose();
    }

    @Override
    public void dispose() {
        this.stage.dispose();
        
    }
}
