package com.pearl.genius.composite;

public abstract class Entry {

	abstract String getName();

	abstract int getSize();

	public void add() throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	public void printList() {
		printList(" ");
	}

	protected abstract void printList(String prefix);

	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}