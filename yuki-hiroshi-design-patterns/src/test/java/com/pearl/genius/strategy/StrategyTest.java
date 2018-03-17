package com.pearl.genius.strategy;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class StrategyTest {

	private Player player2;
	private Player player1;
	private Random random;

	@Before
	public void setUp() {
		random = new Random();
		player1 = new Player("두리", new WinningStrategy(random.nextInt()));
		player2 = new Player("하나", new ProbStrategy(random.nextInt()));

	}

	@Test
	public void strategyTest() {
		for (int i = 0; i < 10; i++) {
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			if (nextHand1.isStrongerThan(nextHand2)) {
				System.out.println("Winner : " + player1);
				player1.win();
				player2.lose();
			} else if (nextHand2.isStrongerThan(nextHand1)) {
				System.out.println("Winner : " + player2);
				player1.lose();
				player2.win();
			} else {
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
		}
		System.out.println("Total result :");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}
}
