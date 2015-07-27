package com.pearl.genius.builder;

/**
 * Created by Administrator on 2015-07-28.
 */
public class HTMLBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {

	}

	@Override
	public void makeString(String str) {

	}

	@Override
	public void makeItems(String[] items) {

	}

	@Override
	public void close() {

	}

	public StringBuffer getResult() {
		return buffer;
	}
}
