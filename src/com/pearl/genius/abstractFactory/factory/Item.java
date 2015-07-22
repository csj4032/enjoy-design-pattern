package com.pearl.genius.abstractFactory.factory;

/**
 * Created by Administrator on 2015-07-22.
 */
public abstract class Item {

	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();
}