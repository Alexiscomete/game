package fr.alexiscomete.test.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import fr.alexiscomete.test.MyGdxGame;

public class DesktopLauncher {

	public static final int W = 900;
	public static final int H = 500;

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Test";
		config.height = H;
		config.width = W;
		new LwjglApplication(new Drop(), config);
	}


}
