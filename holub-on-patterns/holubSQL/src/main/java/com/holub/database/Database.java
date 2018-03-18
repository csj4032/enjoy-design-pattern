package com.holub.database;

import com.holub.text.Scanner;
import com.holub.text.TokenSet;

public class Database {

	private String expression;
	private Scanner in;
	private static final TokenSet tokens = new TokenSet();

	public Table execute(String expression) {
		this.expression = expression;
		in = new Scanner(tokens, expression);
		in.advance();
		return statement();
	}

	private Table statement() {
		return null;
	}
}