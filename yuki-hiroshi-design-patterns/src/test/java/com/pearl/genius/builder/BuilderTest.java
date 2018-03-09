package com.pearl.genius.builder;

import org.junit.Test;

public class BuilderTest {

	private Director director;

	@Test
	public void builderTestWithPlain() {
		Builder builder = new TextBuilder();
		builderConstruct(builder);
		builderResultPrint(builder.getResult());
	}

	@Test
	public void builderTestWithHtml() {
		Builder builder = new HTMLBuilder();
		builderConstruct(builder);
		builderResultPrint(builder.getResult());
	}

	private void builderConstruct(Builder builder) {
		director = new Director(builder);
		director.construct();
	}

	private void builderResultPrint(String result) {
		System.out.println(result);
	}
}