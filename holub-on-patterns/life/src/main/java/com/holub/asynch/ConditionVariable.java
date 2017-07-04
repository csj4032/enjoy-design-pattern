package com.holub.asynch;

public class ConditionVariable {

	private volatile boolean isTrue;

	public ConditionVariable(boolean isTrue) {
		this.isTrue = isTrue;
	}

	public synchronized boolean isTrue() {
		return isTrue;
	}

	public synchronized void set(boolean how) {
		if ((isTrue = how) == true)
			notifyAll();
	}

	public final synchronized void waitForTrue() throws InterruptedException {
		while (!isTrue)
			wait();
	}
}
