package com.thecherno.flappy;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Main implements Runnable {

	private int width = 1280;
	private int height = 720;
	private String title = "flappy";
	
	private boolean running = false;
	private Thread thread;
	
	public void start() {
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	public void run() {
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.setTitle(title);
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (running) {
			Display.update();
			if (Display.isCloseRequested()) running = false;
		}
	}
	
	public static void main(String[] args) {
		new Main().start();

	}
}
