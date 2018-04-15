package com.pearl.genius.state;

/**
 * 상태 패턴(state pattern)은 객체 지향 방식으로 상태 기계를 구현하는 행위 소프트웨어 디자인 패턴
 */
public class Main {

	public static void main(String[] args) {
		SafeFrame frame = new SafeFrame("State Sample");
		while (true) {
			for (int hour = 0; hour < 24; hour++) {
				frame.setClock(hour);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
