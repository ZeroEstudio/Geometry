package com.ZeroStudio.Geometry.Screens;

import com.ZeroStudio.Geometry.Geo;
import com.badlogic.gdx.Screen;

public abstract class AbstractScreen implements Screen {
	
	protected Geo game;

	public AbstractScreen(Geo game) {
		this.game=game;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
