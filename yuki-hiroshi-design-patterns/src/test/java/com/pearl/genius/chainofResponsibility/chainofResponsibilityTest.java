package com.pearl.genius.chainofResponsibility;

import org.junit.Test;

/**
 * 복수의 오브젝트(객체)를 사슬(chain)처럼 연결 해 두면, 그 오브젝트(객체)의 사슬을 차례로 돌아다니면서 목적한 오브젝트(객체)를 결정하는 방법
 */
public class chainofResponsibilityTest {

	@Test
	public void chainTest() {
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new LimitSupport("Diana", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);

		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

		for (int i = 0; i < 500; i += 33) {
			alice.support(new Trouble(i));
		}
	}
}