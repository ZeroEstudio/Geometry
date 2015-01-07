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
		degress[2]=(float)Math.sinh(altura/Math.hypot(base, altura));
		degress[1]=(float)(altura/(base/2));
		degress[0]=180-2*degress[2];
	}
	
	public float getVertice(){
		return degress[0];
	}

}
