package com.pearl.genius.prototype;

import com.pearl.genius.prototype.framework.Manager;
import com.pearl.genius.prototype.framework.Product;

/**
 * Created by genius on 15. 7. 21..
 */
public class PrototypeMain {

	public static void main(String[] args) {
		Manager manager= new Manager() ;
		MessageBox mbox = new MessageBox('*');
		manager.register("warning box", mbox);

		Product p1 = manager.create("warning box");
		p1.use("Hello world");
	}
}
