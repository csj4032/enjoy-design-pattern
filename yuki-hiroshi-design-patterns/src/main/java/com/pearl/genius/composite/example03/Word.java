package com.pearl.genius.composite.example03;

import java.util.List;

public class Word extends LetterComposite {

	public Word(List<Letter> latters) {
		latters.forEach(e -> this.add(e));
	}

	@Override
	protected void printThisBefore() {
		System.out.print(" ");
	}

	@Override
	protected void printThisAfter() {

	}
}
