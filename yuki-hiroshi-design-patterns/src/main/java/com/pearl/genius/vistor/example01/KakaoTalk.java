package com.pearl.genius.vistor.example01;

public class KakaoTalk implements Sender {

	private int code;
	private int content;
	private int reciever;

	public boolean send(Content content) {
		System.out.println("KakaoTalk send content : " + content.toString());
		//검증

		send();
		return true;
	}

	public boolean send(File file) {
		System.out.println("KakaoTalk send file : " + file.toString());
		if (file.getSize() > 100) return false;
		return true;
	}

	public boolean send(Image image) {
		System.out.println("KakaoTalk send file : " + image.getImageName());
		if (image.getHeigth() != image.getWidth()) {
			//
		};
		return true;
	}

	private boolean send () {
		// 개발자 키
		//카카오톡 rest API
		return false;
	}
}
