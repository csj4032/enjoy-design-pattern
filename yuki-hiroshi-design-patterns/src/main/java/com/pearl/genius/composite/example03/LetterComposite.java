package com.pearl.genius.composite.example03;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {

	private List<LetterComposite> children = new ArrayList();

	public void add(LetterComposite letter) {
		children.add(letter);
	}

	public int count() {
		return children.size();
	}

	protected abstract void printThisBefore();

	protected abstract void printThisAfter();

	public void print() {
		printThisBefore();
		children.forEach(e -> e.print());
		printThisAfter();
	}
}
