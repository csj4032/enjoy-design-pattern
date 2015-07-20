package com.pearl.genius.adapter;

/**
 바꿔서 재이용하기
 이미 제공되어 있는 것과 필요한 것 사이의 차이를 없애주는 디자인 패턴

 1. 클래스에 의한 Adapter 패턴
 2. 인스턴스에 의한 Adapter 패턴
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
