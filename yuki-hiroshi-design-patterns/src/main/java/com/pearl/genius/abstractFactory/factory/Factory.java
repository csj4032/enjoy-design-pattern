package com.pearl.genius.abstractFactory.factory;

public interface Factory {

	Link createLink(String caption, String url);

	Tray createTray(String caption);

	Page cretePage(String title, String author);

}