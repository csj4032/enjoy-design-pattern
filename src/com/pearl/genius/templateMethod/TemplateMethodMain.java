package com.pearl.genius.templateMethod;

/**
 * 상위 클래스쪽에 템플릿에 해당하는 메소드가 정의되어 있고 그 메소드의 정의 안에는 추상 메소드 가 시용되고 있음
 * 상위 클래스의 프로그램만 보면 추상 메소드를 어떻게 호출 하고 있는지 알 수 있지만 최종적으로 어떤 처리가 수행되는지는 알 수 없음
 *
 * 템플릿이란 문자 모양으로 구멍이 뚫려있는 앓은 플라스틱 판을 말합니다.
 * 그 구멍을 따라 펜으로 그리면 손으로도 반듯한 문자를 쓸 수 있습니다.
 * 템플릿의 구멍을 보면 어떤 모양의 문자인지는 알 수 있지만, 실제로 어떤 문자가 될지는 필기구에 의해 결정됩니다.
 *
 * 상위 클래스에서 하위 클래스에게 요청
 * 상위 클래스와 하위 클래스의 협조
 */

public class TemplateMethodMain {

	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello World");
		AbstractDisplay d3 = new StringDisplay("안녕하세요");
		d1.display();
		d2.display();
		d3.display();
	}
}
