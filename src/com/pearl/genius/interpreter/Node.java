package com.pearl.genius.interpreter;

import java.text.ParseException;

public abstract class Node {
	abstract void parse(Context context) throws ParseException;
}
