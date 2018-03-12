package com.pearl.genius.abstractFactory;

import com.pearl.genius.abstractFactory.factory.Factory;
import com.pearl.genius.abstractFactory.listfactory.ListFactory;
import com.pearl.genius.abstractFactory.tablefactory.TableFactory;

import java.util.HashMap;

public class FactoryManager {

	private static HashMap<String, Factory> factoryHashMap = new HashMap();
	private static FactoryManager manager;

	private FactoryManager() {
	}

	public static FactoryManager getInstance() {
		if (manager == null) {
			synchronized (FactoryManager.class) {
				manager = new FactoryManager();
				init();
			}
		}
		return manager;
	}

	private static void init() {
		factoryHashMap.put("list", new ListFactory());
		factoryHashMap.put("table", new TableFactory());
	}

	public Factory getFactory(String key) {
		return factoryHashMap.get(key);
	}
}