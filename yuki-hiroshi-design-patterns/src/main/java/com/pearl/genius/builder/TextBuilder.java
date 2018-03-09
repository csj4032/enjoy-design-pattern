package com.pearl.genius.builder;

public class TextBuilder implements Builder {

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		buffer.append("=============================\n");
		buffer.append("『" + title + "』");
		buffer.append("\n");
	}

	@Override
	public void makeString(String str) {
		buffer.append("■" + str + "\n");
		buffer.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer.append("＊" + items[i] + "\n");
		}
	}

	@Override
	public void close() {
		buffer.append("=============================\n");
	}

	@Override
	public String getResult() {
		return buffer.toString();
	}
}