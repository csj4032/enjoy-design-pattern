package com.pearl.genius.abstractFactory.tablefactory;

import com.pearl.genius.abstractFactory.factory.Item;
import com.pearl.genius.abstractFactory.factory.Page;

import java.util.Iterator;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHtml() {
		StringBuilder builder = new StringBuilder();
		builder.append("<html>\n<head>\n<title>" + title + "</title>\n</head>\n");
		builder.append("<body>\n");
		builder.append("<h1>" + title + "</h1>\n");
		builder.append("<table width=\"80%\" board=\"3\">\n");
		Iterator it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			builder.append("<tr>" + item.makeHTML() + "</tr>\n");
		}
		builder.append("</table>\n");
		builder.append("<hr>\n<address>" + author + "</address>\n");
		builder.append("</body>\n</html>");
		return builder.toString();
	}
}