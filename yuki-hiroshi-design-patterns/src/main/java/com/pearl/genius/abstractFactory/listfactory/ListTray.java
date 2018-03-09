package com.pearl.genius.abstractFactory.listfactory;

import com.pearl.genius.abstractFactory.factory.Item;
import com.pearl.genius.abstractFactory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append("<li>\n").append(caption + "\n").append("<ul>\n");
		Iterator it = tray.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			builder.append(item.makeHTML());
		}
		builder.append("</ul>\n").append("</li>\n");
		return builder.toString();
	}
}
