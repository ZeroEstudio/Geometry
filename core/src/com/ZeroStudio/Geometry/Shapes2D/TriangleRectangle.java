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
		genDrigress();
	}

	@Override
	protected void genDrigress() {
		degress[0] = Math.round(Math.toDegrees(Math.asin(base/hipotenusa)));
		degress[1] = Math.round(Math.toDegrees(Math.asin(altura/hipotenusa)));
		degress[2] = 90;
	}
	
	public int getHipotenusa(){
		return (int)hipotenusa;
	}
	
	public double getDegress(int index){
		return degress[index];
	}

}
