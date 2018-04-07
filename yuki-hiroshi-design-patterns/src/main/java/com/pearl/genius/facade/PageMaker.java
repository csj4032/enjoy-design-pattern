package com.pearl.genius.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

	private PageMaker() {

	}

	public static void makeWelcomePage(String mailaddr, String filename) throws IOException {
		Properties mailProp = Database.getProperties("maildata");
		String username = mailProp.getProperty(mailaddr);
		HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
		writer.title("Welcome to " + username + "'s page!");
		writer.paragraph("메일을 기다리고 있습니다.");
		writer.mailto(mailaddr, username);
		writer.close();
		System.out.println(filename + "is created for " + mailaddr + "(" + username + ")");
	}
}
