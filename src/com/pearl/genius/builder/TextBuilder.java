package com.pearl.genius.builder;

/**
 * Created by Administrator on 2015-07-28.
 */
public class TextBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {

	}

	@Override
	public void makeString(String title) {

	}

	@Override
	public void makeItems(String title) {

	}

	@Override
	public void close() {

	}

	public String getResult() {
		return buffer.toString();
	}
}