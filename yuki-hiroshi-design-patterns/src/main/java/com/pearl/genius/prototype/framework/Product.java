package com.pearl.genius.prototype.framework;

/**
 * Created by genius on 15. 7. 21..
 */
public interface Product extends Cloneable {

	void use(String s);

	Product createClone();
}