package com.pearl.genius.builder;

public interface Builder {

	void makeTitle(String title);

	void makeString(String str);

	void makeItems(String[] items);

	void close();

	String getResult();
}
