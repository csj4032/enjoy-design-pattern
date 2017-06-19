package com.pearl.genius.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {

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
			this.fontData = charName + "?";
		}
	}

	public void print() {
		System.out.print(fontData);
	}
}