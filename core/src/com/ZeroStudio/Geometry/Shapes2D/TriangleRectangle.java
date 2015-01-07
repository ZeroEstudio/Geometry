package com.ZeroStudio.Geometry.Shapes2D;


public class TriangleRectangle extends Triangle {
	
	private double hipotenusa;
	
	public TriangleRectangle(float base, float altura) {
		this(new float[] {startX, startY, startX+base, startY, startX, startY+altura}, 
				TriangleType.RECTANGLE, base, altura);
	}

	private TriangleRectangle(float[] vertices, TriangleType type, float base, float altura) {
		super(vertices, type, base, altura);
		hipotenusa = Math.hypot(base, altura);
	}

	@Override
	protected void genDrigress() {
		degress[0] = (float) (base/hipotenusa); //how to sin-1?
		degress[1] = (float) (altura/hipotenusa);
		degress[2] = 90;
	}
	
	public int getHipotenusa(){
		return (int)hipotenusa;
	}
	
	public float[] getDegress(){
		return degress;
	}

}
