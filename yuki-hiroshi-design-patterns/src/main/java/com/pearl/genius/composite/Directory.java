package com.pearl.genius.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Directory extends Entry {

	private String name;
	private Optional<List<Entry>> directory = Optional.of(new ArrayList());

	public Directory(String name) {
		this.name = name;
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	int getSize() {
		return directory.isPresent() ? directory.get().stream().mapToInt(e -> e.getSize()).sum() : 0;
	}

	public Entry add(Entry entry) {
		directory.ifPresent(e -> e.add(entry));
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		directory.ifPresent(d -> d.forEach(e -> e.printList(prefix + "/" + name)));
	}
}