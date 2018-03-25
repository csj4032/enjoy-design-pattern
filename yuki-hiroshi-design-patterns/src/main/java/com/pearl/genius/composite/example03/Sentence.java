package com.pearl.genius.composite.example03;

import java.util.List;

public class Sentence extends LetterComposite {

	public Sentence(List<Word> words) {
		words.forEach(e -> this.add(e));
	}

	@Override
	protected void printThisBefore() {

	}

	@Override
	protected void printThisAfter() {
		System.out.print(".");
	}
}
