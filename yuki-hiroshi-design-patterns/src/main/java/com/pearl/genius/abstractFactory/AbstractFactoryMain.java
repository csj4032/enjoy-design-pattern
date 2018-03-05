package com.pearl.genius.abstractFactory;

import com.pearl.genius.abstractFactory.factory.Factory;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
	}
}