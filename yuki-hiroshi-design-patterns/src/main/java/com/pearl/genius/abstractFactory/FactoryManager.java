package com.pearl.genius.abstractFactory;

import com.pearl.genius.abstractFactory.factory.Factory;
import com.pearl.genius.abstractFactory.listfactory.ListFactory;
import com.pearl.genius.abstractFactory.tablefactory.TableFactory;

public class FactoryManager {

	private static FactoryManager manager;

	private FactoryManager() {
	}

	public static FactoryManager getInstance() {
		if (manager == null) {
			synchronized (FactoryManager.class) {
				manager = new FactoryManager();
			}
		}
		return manager;
	}

	public Factory getFactory(FactoryType type) {
		return FactoryType.getFactory(type);
	}
}

enum FactoryType {
	LIST_FACTORY(new ListFactory()),
	TABLE_FACTORY(new TableFactory());

	private Factory factory;

	FactoryType(Factory factory) {
		this.factory = factory;
	}

	public static Factory getFactory(FactoryType type) {
		return FactoryType.valueOf(type.name()).factory;
	}
}