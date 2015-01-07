package com.ZeroStudio.Geometry.Shapes2D;


public class TriangleIsoseles extends Triangle {

	public TriangleIsoseles(float base, float altura) {
		this(new float[] {startX, startY, startX+base, startY, startX+(base/2), startY+altura},
				TriangleType.ISOSELES, base, altura);
	}
	
	private TriangleIsoseles(float[] vertices, TriangleType type, float base,
			float altura) {
		super(vertices, type, base, altura);
		genDrigress();
	}

	@Override
	protected void genDrigress() {
		degress[2]=Math.round(Math.toDegrees(Math.atan((altura/(base/2)))));
		degress[1]=Math.round(Math.toDegrees(Math.atan((altura/(base/2)))));
		degress[0]=180-2*degress[2];
	}
	
	public double getVertice(){
		return degress[0];
	}

}
