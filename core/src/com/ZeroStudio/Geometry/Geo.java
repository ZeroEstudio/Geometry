package com.ZeroStudio.Geometry;

import java.util.Random;

import com.ZeroStudio.Geometry.Screens.Scene2DScreenUI;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Geo extends Game {
	
	private int width, height;
	private Viewport view;
	private SpriteBatch batch;
	Random r = new Random();
	
	@Override
	public void create () {
		width = 860; height = 700;
		batch = new SpriteBatch();
		view = new FitViewport(width, height);
		
		setScreen(new Scene2DScreenUI(this));
	}

	/**
	 * Generate an array of digresses from a triangle
	 * @return digress'
	 * @author Kenshi Zhekaru
	 */
	public int[] getDegress(){
		int[] digress = new int[3];
		
		digress[1] = 1 + r.nextInt(digress[0]/2);
		digress[0]-=digress[1];
		digress[2] = 1 + r.nextInt(digress[0]/2);
		digress[0]-=digress[2];
		
		return digress;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Viewport getView() {
		return view;
	}

	public SpriteBatch getBatch() {
		return batch;
	}
}
