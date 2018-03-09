package com.pearl.genius.prototype.framework;

public interface MessageBox extends Cloneable {

	void use(String s);

	MessageBox createClone();
}