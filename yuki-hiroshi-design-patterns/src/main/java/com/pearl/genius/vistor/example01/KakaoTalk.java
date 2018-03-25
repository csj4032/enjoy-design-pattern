package com.pearl.genius.vistor.example01;

public class KakaoTalk implements Sender {

	public boolean send(Content content) {
		System.out.println("KakaoTalk send content : " + content.toString());
		return true;
	}

	public boolean send(File file) {
		System.out.println("KakaoTalk send file : " + file.toString());
		if (file.getSize() > 100) return false;
		return true;
	}
}
