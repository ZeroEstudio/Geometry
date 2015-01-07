package com.ZeroStudio.Geometry.Shapes2D;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Polygon;

public abstract class Triangle extends Polygon {

	public static ShapeRenderer shapeRenderer = new ShapeRenderer();
	
	protected TriangleType type;
	protected float base, altura;
	protected final float[] degress = new float[3];
	protected static final float startX = 100, startY = 100;
	
	protected Triangle(float[] vertices, TriangleType type, float base, float altura) {
		super(vertices);
		this.type=type;
		this.base=base;
		this.altura=altura;
	}
	
	protected abstract void genDrigress();
	
	public float getBase() {
		return base;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void draw(Color color){
		shapeRenderer.setColor(color);
		shapeRenderer.begin(ShapeType.Line);
		shapeRenderer.polygon(getTransformedVertices());
		shapeRenderer.end();
	}
	
	public boolean overLaps(Triangle tr){
		return Intersector.overlapConvexPolygons(this, tr);
	}

}
