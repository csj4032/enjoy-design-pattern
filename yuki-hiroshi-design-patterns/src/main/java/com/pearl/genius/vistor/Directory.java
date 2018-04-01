package com.pearl.genius.vistor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

	private String name;
	private List<Entry> dir = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		return dir.stream().map(m -> m.getSize()).mapToInt(Integer::intValue).sum();
	}

	public Entry add(Entry entry) {
		dir.add(entry);
		return this;
	}

	public Iterator<Entry> iterator() {
		return dir.iterator();
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}