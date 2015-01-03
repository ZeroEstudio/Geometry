package com.ZeroStudio.Geometry.desktop;

import com.ZeroStudio.Geometry.Geo;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=860;
		config.height=700;
		new LwjglApplication(new Geo(), config);
	}
}
