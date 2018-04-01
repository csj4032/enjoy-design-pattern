package com.pearl.genius.chainofResponsibility;

public class LimitGeniusSupport extends Support {

	private int limit;

	public LimitGeniusSupport(String name, int i) {
		super(name);
		this.limit = limit * 1000;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}
}