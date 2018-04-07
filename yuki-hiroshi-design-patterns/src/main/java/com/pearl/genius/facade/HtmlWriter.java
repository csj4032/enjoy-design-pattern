package com.pearl.genius.facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {

	private Writer writer;

	public HtmlWriter(Writer writer) {
		this.writer = writer;
	}

	public void title(String title) throws IOException {
		writer.write("<html>\n");
		writer.write("\t<head>\n");
		writer.write("\t\t<title>" + title + "</title>\n");
		writer.write("</head>\n");
	}

	public void paragraph(String msg) throws IOException {
		writer.write("<p>" + msg + "</p>\n");
	}

	public void link(String href, String caption) throws IOException {
		writer.write("<a href=\"" + href + "\">" + caption + "</a>\n");
	}

	public void mailto(String mailaddr, String username) throws IOException {
		link("mailto:" + mailaddr, username);
	}

	public void close() throws IOException {
		writer.write("</html>");
		writer.close();
	}
}
