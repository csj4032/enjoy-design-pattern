package com.pearl.genius.abstractFactory.tablefactory;

import com.pearl.genius.abstractFactory.factory.Factory;
import com.pearl.genius.abstractFactory.factory.Link;
import com.pearl.genius.abstractFactory.factory.Page;
import com.pearl.genius.abstractFactory.factory.Tray;

public class TableFactory implements Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page cretePage(String title, String author) {
		return new TablePage(title, author);
	}
}
