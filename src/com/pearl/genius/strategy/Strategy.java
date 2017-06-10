package com.pearl.genius.strategy;

public interface Strategy {

	Hand nextHand();

	void study(boolean win);
}
