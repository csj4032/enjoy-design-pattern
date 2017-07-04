package com.pearl.genius.vistor;

public class ListVisitor extends Visitor {

	private String currentDir = "";

	@Override
	void visit(File file) {
		System.out.println(currentDir + "/" + file);
	}

	@Override
	void visit(Directory directory) {
		System.out.println(currentDir + "/" + directory);
		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		directory.iterator().forEachRemaining(i -> i.accept(this));
		currentDir = saveDir;
	}
}
