package com.pearl.genius.vistor.example01;

public class Line implements Sender {

	public boolean send(Content content) {
		System.out.println("Line send content : " + content.toString());
		if (content.getContent().getBytes().length > 10) return false;
		return true;
	}

	@Override
	public boolean send(File file) {
		System.out.println("Line send file : " + file.toString());
		return true;
	}
}
