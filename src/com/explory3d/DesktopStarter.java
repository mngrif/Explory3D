package com.explory3d;

import com.badlogic.gdx.backends.jogl.JoglApplication;

public class DesktopStarter {
	public static void main(String[] args){
		new JoglApplication(new Explory(),
				"title",
				480, 320, false);
	}
}
