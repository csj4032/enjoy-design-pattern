package com.pearl.genius.vistor;

public abstract class Visitor {
	abstract void visit(File file);
	abstract void visit(Directory directory);
}