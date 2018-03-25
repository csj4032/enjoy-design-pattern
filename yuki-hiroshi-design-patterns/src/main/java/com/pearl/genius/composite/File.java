package com.pearl.genius.composite;

public class File extends Entry {

	private String name;
	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	int getSize() {
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}
}
