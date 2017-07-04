package com.pearl.genius.adapter;

/**

 바꿔서 재이용하기
 이미 제공되어 있는 것과 필요한 것 사이의 차이를 없애주는 디자인 패턴

 1. 클래스에 의한 Adapter 패턴
 2. 인스턴스에 의한 Adapter 패턴

 이미 존재하고 있는 클래스를 이용하는 경우 특히 그 클래스가 충분한 테스트를 받아서 버그가 적으며
 실제로 지금까지 사용된 실적이 있드면 그 클래스를 부품으로 재이용하고 싶을 것

 Adapter 패턴에서는 기존 클래스의 소스 프로그램이 반드시 펼요한 것은 아님
 기존 클래스의 사양만 알 면 새로운 클래스를 만들 수 있음

**/

public class AdapterMain {

	public static void main(String[] args) {

		// 클래스 상속
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();

		// 위임
		PrintTrust pt = new PrintBannerTrust("World");
		pt.printWeak();
		pt.printStrong();
	}
}
