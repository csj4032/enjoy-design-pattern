package com.pearl.genius.prototype.framework;

import java.util.HashMap;

public class Manager {

	private HashMap<String, MessageBox> showcase = new HashMap();

	public void register(String name, MessageBox product) {
		showcase.put(name, product);
	}

	public MessageBox create(String name) {
		MessageBox p = showcase.get(name);
		return p.createClone();
	}
}