package com.pearl.genius.vistor.example01;

public class Telegram implements Sender {

	public boolean send(Content content) {
		System.out.println("Telegram send content : " + content.toString());
		return true;
	}

	@Override
	public boolean send(File file) {
		System.out.println("Telegram send file : " + file.toString());
		return true;
	}
}
