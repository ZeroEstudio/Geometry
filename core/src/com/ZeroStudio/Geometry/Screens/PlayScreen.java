package com.ZeroStudio.Geometry.Screens;

import com.ZeroStudio.Geometry.Geo;
import com.ZeroStudio.Geometry.Shapes2D.TriangleEquilatero;
import com.ZeroStudio.Geometry.Shapes2D.TriangleIsoseles;
import com.ZeroStudio.Geometry.Shapes2D.TriangleRectangle;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Ellipse;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class PlayScreen extends AbstractScreen{
	
	private Stage stage;
	
	TriangleRectangle tRect;
	TriangleEquilatero tEqui;
	TriangleIsoseles tIsos;
	
	Circle circle, circle2;
	Ellipse ellipse;
	int c =0, c2=0;

	public PlayScreen(Geo game) {
		super(game);
	}

	@Override
	public void show() {
		stage = new Stage(game.getView(), game.getBatch());
		stage.getViewport().update(game.getWidth(), game.getHeight());
		Gdx.input.setInputProcessor(stage);
		
		circle = new Circle(100,  500, 60);
		circle2 = new Circle(500,  500, 60);
		
		ellipse = new Ellipse(circle);
		
		tRect = new TriangleRectangle(100, 50);
		tRect.setPosition(250, 250);
		tRect.setScale(2f, 2f);
		System.out.println("area tRect: "+tRect.area());
		System.out.println("base tRect: "+tRect.getBase());
		System.out.println("altura tRect: "+tRect.getAltura());
		System.out.println("Hipo tRect: "+tRect.getHipotenusa());
		System.out.println("angle1: "+tRect.getDegress(0));
		System.out.println("angle2: "+tRect.getDegress(1));
		System.out.println("angle3: "+tRect.getDegress(2));
		
		tEqui = new TriangleEquilatero(100);
		tEqui.setPosition(350, 500);
		System.out.println("area tEqui: "+tEqui.area());
		System.out.println("base tEuiq: "+tEqui.getBase());
		System.out.println("altura tEuiq: "+tEqui.getAltura());
		
		tIsos = new TriangleIsoseles(200, 500);
		tIsos.setScale(.5f, .5f);
		System.out.println("area tIsos: "+tIsos.area());
		System.out.println("base tIsos: "+tIsos.getBase());
		System.out.println("altura tIsos: "+tIsos.getAltura());
		System.out.println("vertice: "+tIsos.getVertice());
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.draw();
		stage.act();
		
		if(tEqui.overLaps(tIsos)){
			System.out.println("Overlaps Poligon");
		}
		
		circle2.x--;
//		poligon1.rotate(c++);
		tEqui.setRotation(c2--);
		
		if(circle.overlaps(circle2)){
			System.out.println("Cilision of circles");
		}
		
		tRect.draw(Color.BLUE);
		tEqui.draw(Color.BLACK);
		tIsos.draw(Color.CYAN);
		
		
//		shapeRenderer.setColor(Color.BLACK);
//		shapeRenderer.begin(ShapeType.Line);
//		shapeRenderer.circle(circle.x, circle.y, circle.radius);
//		shapeRenderer.circle(circle2.x, circle2.y, circle2.radius);
//		shapeRenderer.ellipse(ellipse.x, ellipse.y, ellipse.width, ellipse.height);
//		shapeRenderer.end();

//		shapeRenderer.setColor(Color.BLACK);
//		shapeRenderer.begin(ShapeType.Line);
//		shapeRenderer.circle(300, 300, 100, 6);
//		shapeRenderer.arc(100, 100, 50, 300, 100);
//		shapeRenderer.end();
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
