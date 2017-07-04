package com.pearl.genius.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BigChar {

	private static Logger logger = Logger.getLogger(BigChar.class.getName());

	private String fontData;

	public BigChar(char charName) {
		try (BufferedReader reader = new BufferedReader(new FileReader("big" + charName + ".txt"))) {
			String line;
			StringBuilder buf = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontData = buf.toString();
		} catch (IOException e) {
			logger.log(Level.ALL, e.getMessage());
			this.fontData = charName + "?";
		}
	}

	public void print() {
		logger.log(Level.ALL, fontData);
	}
}