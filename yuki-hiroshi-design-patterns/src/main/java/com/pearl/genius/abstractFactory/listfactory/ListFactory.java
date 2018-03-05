package com.pearl.genius.abstractFactory.listfactory;

import com.pearl.genius.abstractFactory.factory.Factory;
import com.pearl.genius.abstractFactory.factory.Link;
import com.pearl.genius.abstractFactory.factory.Page;
import com.pearl.genius.abstractFactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return null;
	}

	@Override
	public Page cretePage(String title, String author) {
		return null;
	}
}
