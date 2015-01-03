package com.ZeroStudio.Geometry.Screens;

import com.ZeroStudio.Geometry.Geo;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PlayScreen extends AbstractScreen{
	
	private Stage stage;

	public PlayScreen(Geo game) {
		super(game);
	}

	@Override
	public void show() {
		stage = new Stage(game.getView(), game.getBatch());
		stage.getViewport().update(game.getWidth(), game.getHeight());
		Gdx.input.setInputProcessor(stage);
		
		Image img = new Image(new Texture("badlogic.jpg"));
		img.setPosition(100, 100);
		stage.addActor(img);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.draw();
		stage.act();
	}

	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
	}
	
	@Override
	public void dispose() {
		stage.dispose();
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(game.getWidth(), game.getHeight());
	}

}
