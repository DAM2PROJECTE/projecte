package game.pokemon.Engine;

import com.badlogic.gdx.Gdx;

/**
 * Created by marccat on 10/3/2018.
 */

public class Config {

    public static final int BUTTON_ARROW_LEFT = 21;
    public static final int BUTTON_ARROW_RIGHT = 22;
    public static final int BUTTON_ARROW_UP =19;
    public static final int BUTTON_ARROW_DOWN = 20;
    public static final int BUTTON_A = 29;
    public static boolean debug = true;

    private int withGame;
    private int pixelsSquareWith;
    private int pixelsCharacterWith;

    private int heightGame;
    private int pixelsSquareHeight;
    private int pixelsCharacterHeight;

    public Config() {

        this.withGame= Gdx.graphics.getWidth();
        this.heightGame = Gdx.graphics.getHeight();

        this.pixelsSquareHeight = 32;
        this.pixelsSquareWith = 32;

        this.pixelsCharacterHeight = 48;
        this.pixelsCharacterWith = 32;

    }

    public int getWithGame() {
        return withGame;
    }
    public int getHeightGame() {
        return heightGame;
    }
    public int getPixelsSquareWith() {
        return pixelsSquareWith;
    }
    public int getPixelsSquareHeight() {
        return pixelsSquareHeight;
    }
    public int getPixelsCharacterWith() {
        return pixelsCharacterWith;
    }
    public int getPixelsCharacterHeight() {
        return pixelsCharacterHeight;
    }

    public void setWithGame(int withGame) {
        this.withGame = withGame;
    }
    public void setHeightGame(int heightGame) {
        this.heightGame = heightGame;
    }
    public void setPixelsSquareWith(int pixelsSquareWith) {
        this.pixelsSquareWith = pixelsSquareWith;
    }
    public void setPixelsSquareHeight(int pixelsSquareHeight) {
        this.pixelsSquareHeight = pixelsSquareHeight;
    }
    public void setPixelsCharacterWith(int pixelsCharacterWith) {
        this.pixelsCharacterWith = pixelsCharacterWith;
    }
    public void setPixelsCharacterHeight(int pixelsCharacterHeight) {
        this.pixelsCharacterHeight = pixelsCharacterHeight;
    }


}
