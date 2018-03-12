package com.pearl.genius.builder;

import java.util.Map;

public class Director {

	private Builder builder;
	private Map<String,String> map;

	public Director(Builder builder) {
		this.builder = builder;
		this.map = map;
	}

	public void construct() {
		builder.makeTitle("greeting");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[]{"좋은 아침입니다.", "안녕하세요"});
		builder.makeString("밤에");
		builder.makeItems(new String[]{"안녕하세요", "안녕히 주무세요", "안녕히 계세요"});
		builder.close();
	}
}