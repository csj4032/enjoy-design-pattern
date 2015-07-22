package com.pearl.genius.prototype.framework;

/**
 * Created by genius on 15. 7. 21..
 */
public interface Product extends Cloneable {

	public abstract void use(String s);

	public abstract Product createClone();
}