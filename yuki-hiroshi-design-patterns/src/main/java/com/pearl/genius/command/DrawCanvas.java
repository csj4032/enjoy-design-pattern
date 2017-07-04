package com.pearl.genius.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

	private Color color;
	private int radius;
	private MacroCommand history;

	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
		init();
	}

	public void init() {
		color = Color.RED;
		radius = 6;
	}

	public void paint(Graphics g) {
		history.execute();
	}

	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius * 2, radius * 2, radius * 2);
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
