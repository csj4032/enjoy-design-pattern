package com.pearl.genius.command;

import java.awt.*;

public class ColorCommand implements Command {

	protected Drawable drawable;
	private Color color;

	public ColorCommand(Drawable drawable, Color color) {
		this.drawable = drawable;
		this.color = color;
	}

	@Override
	public void execute() {
		drawable.setColor(color);
	}
}