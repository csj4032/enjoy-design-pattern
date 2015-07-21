package com.pearl.genius.factoryMethod.framework;

/**
 * Created by genius on 15. 7. 21..
 */
public abstract class Factory {

	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product product);
}
