package com.pearl.genius.composite.example03;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {

	private List<LetterComposite> chidren = new ArrayList();

	public void add(LetterComposite letter) {
		chidren.add(letter);
	}

	public int count() {
		return chidren.size();
	}

	protected abstract void printThisBefore();

	protected abstract void printThisAfter();

	public void print() {
		printThisBefore();
		chidren.forEach(e -> e.print());
		printThisAfter();
	}
}
