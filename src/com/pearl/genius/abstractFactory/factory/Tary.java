package com.pearl.genius.abstractFactory.factory;

import java.util.ArrayList;

public abstract class Tary extends Item {

	protected ArrayList tray = new ArrayList();

	public Tary(String caption) {
		super(caption);
	}

	public void add(Item item) {
		tray.add(item);
	}
}
