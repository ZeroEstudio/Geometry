package com.ZeroStudio.Geometry.Screens;

import com.ZeroStudio.Geometry.Geo;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;

public class Scene2DScreenUI extends AbstractScreen{
	
	private Stage stage;
	private TextButton button;
	private Skin skin;
	private Table table;

	public Scene2DScreenUI(Geo game) {
		super(game);
	}

	@Override
	public void show() {
		stage = new Stage(game.getView(), game.getBatch());
		stage.getViewport().update(game.getWidth(), game.getHeight());
		stage.getViewport().getWorldWidth();
		Gdx.input.setInputProcessor(stage);
		
		table = new Table();
		table.setFillParent(true);
		table.setDebug(true);
		
		skin = new Skin(Gdx.files.internal("skin/uiskin.json"));
		
		Label lblNombre = new Label("Nombre", skin);
		Label lblPuntuacion = new Label("Puntuacion", skin);
		TextField txtNombre = new TextField("", skin);
		TextField txtPuntuacion = new TextField("500", skin);
		TextButton btnEnviar = new TextButton("Enviar", skin);
		
		table.add(lblNombre);
		table.add(txtNombre);
		table.row();
		table.add(lblPuntuacion);
		table.add(txtPuntuacion);
		table.row();
		table.add(btnEnviar).colspan(2).fill();
		table.debug();
		
		stage.addActor(table);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.act();
		stage.draw();
		
	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(game.getWidth(), game.getHeight());
	}

	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
	}
	
}
