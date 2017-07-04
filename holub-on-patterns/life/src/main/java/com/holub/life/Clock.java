package com.holub.life;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {

	private Timer clock = new Timer();
	private TimerTask tick = null;

	private Clock() {
		createMenus();
	}

	private void createMenus() {

	}
}
