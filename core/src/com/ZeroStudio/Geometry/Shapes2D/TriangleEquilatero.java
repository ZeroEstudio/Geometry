package com.ZeroStudio.Geometry.Shapes2D;

public class TriangleEquilatero extends Triangle {
	
	public TriangleEquilatero(float lado) {
		this(new float[] {startX, startY, startX+lado, startY, startX+(lado/2), startY+(float)(lado * Math.sqrt(3))/2},
				TriangleType.EQUILATERO, lado, (float)(lado * Math.sqrt(3))/2);
	}

	private TriangleEquilatero(float[] vertices, TriangleType type, float base,
			float altura) {
		super(vertices, type, base, altura);
		genDrigress();
	}

	@Override
	protected void genDrigress() {
		for (int i = 0; i < degress.length; i++) {
			degress[i]=60;
		}
	}

}
