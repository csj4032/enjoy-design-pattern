package com.pearl.genius.prototype.framework;

import java.util.HashMap;

/**
 * Created by genius on 15. 7. 21..
 */
public class Manager {

	private HashMap showcase = new HashMap();

	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}

	public Product create(String protoname) {
		Product p = (Product) showcase.get(protoname);
		return p.createClone();
	}
}
