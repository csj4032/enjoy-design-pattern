package com.pearl.genius.templateMethod;

/**
 * 템플릿이란 문자 모양으로 구멍이 뚫려있는 앓은 플라스틱 판을 말합니다.
 * 그 구멍을 따라 펜으로 그리면 손으로도 반듯한 문자를 쓸 수 있습니다.
 * 템플릿의 구멍을 보면 어떤 모양의 문자인지는 알 수 있지만, 실제로 어떤 문자가 될지는 필기구에 의해 결정됩니다.
 */

public class TempMain {

	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello World");
		AbstractDisplay d3 = new StringDisplay("안녕하세요");
		d1.display();
		d2.display();
		d3.display();
	}
}