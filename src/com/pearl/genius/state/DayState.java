package com.pearl.genius.state;

public class DayState implements State {

	private static DayState singleton = new DayState();

	private DayState() {

	}

	public static synchronized State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {

	}

	@Override
	public void doUse(Context context) {

	}

	@Override
	public void doAlarm(Context context) {

	}

	@Override
	public void doPhone(Context context) {

	}
}
