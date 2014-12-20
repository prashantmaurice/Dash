package com.maurice.dash;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.maurice.GameHelpers.AssetLoader;
import com.maurice.Screens.FinishedScreen;
import com.maurice.Screens.GameScreen;
import com.maurice.Screens.MainMenuScreen;
import com.maurice.Screens.RestartScreen;

public class DashGame extends Game {
	public MainMenuScreen mainMenuScreen;
    public GameScreen gameScreen;
    public RestartScreen restartScreen;
    public FinishedScreen finishScreen;
    private int yourScore=0;
    private int level=1;//use this to set levels
    private int totalLevels=2;
	@Override
	public void create() {
		System.out.println("Game Created!");
		//mainMenuScreen = new MainMenuScreen(this);
		AssetLoader.load();
        gameScreen = new GameScreen(this);
        //restartScreen = new RestartScreen(this);
        //finishScreen = new FinishedScreen(this);
        setScreen(gameScreen);
	}
	@Override
	public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
	public void setGameScreen(){
		
		setScreen(gameScreen);
	}
	public void setNewGameScreen(){
		gameScreen = new GameScreen(this);
		setScreen(gameScreen);
	}
	public void setRestartScreen(){
		setScreen(restartScreen);
	}
	public int getLevel() {
		return level;
	}
	public void nextLevel() {
		level++;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void quitGame(){		
		//Gdx.app.exit();
	}
	public int getYourScore() {
		return yourScore;
	}
	public void setYourScore(int yourScore) {
		this.yourScore = yourScore;
	}
	
}
