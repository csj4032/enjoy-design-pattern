package com.pearl.genius.visitor.example01;

import com.pearl.genius.vistor.example01.*;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class Example01Test {

	@Test
	public void exampleTest() {
		Content content = new Content("genius", "pearl", "hello world");
		assertTrue(content.sender(new KakaoTalk()));
		assertFalse(content.sender(new Line()));
		assertTrue(content.sender(new Telegram()));

		File file = new File("genius", "pearl", "hell world", "file", 110);
		assertFalse(file.sender(new KakaoTalk()));
		assertTrue(file.sender(new Line()));
		assertTrue(file.sender(new Telegram()));

		Image image = new Image("genius", "pearl", "hell world", "image", 200, 2000);
		image.sender(new KakaoTalk());

	}
}