package com.pearl.genius.abstractFactory.factory;

/**
 * Created by Administrator on 2015-07-22.
 */
public abstract class Link extends Item {

	protected String url;

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
}
