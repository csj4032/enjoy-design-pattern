package com.pearl.genius.abstractFactory.tablefactory;

import com.pearl.genius.abstractFactory.factory.Item;
import com.pearl.genius.abstractFactory.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {

	public TableTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append("<td>");
		builder.append("<table width =\"100%\" border=\"1\"><tr>");
		builder.append("<td bgcolor =\"#cccccc\" align =\"center\" colspan =\"" + tray.size() + "\" ><b>" + caption + "</b></td>");
		builder.append("</tr>\n");
		builder.append("<tr>\n");
		Iterator it = tray.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			builder.append(item.makeHTML());
		}
		builder.append("</tr></table>");
		builder.append("</td>");
		return builder.toString();
	}
}
