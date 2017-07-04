package com.pearl.genius.prototype;

import com.pearl.genius.prototype.framework.Product;

/**
 * Created by genius on 15. 7. 21..
 */
public class MessageBox implements Product {

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + "" + s + "" + decochar);
		for (int i = 0; i < length; i++) {
			System.out.print(decochar);
		}
		System.out.print("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
