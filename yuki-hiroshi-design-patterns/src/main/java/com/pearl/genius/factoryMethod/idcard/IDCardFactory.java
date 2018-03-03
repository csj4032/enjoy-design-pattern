package com.pearl.genius.factoryMethod.idcard;

import com.pearl.genius.factoryMethod.framework.Factory;
import com.pearl.genius.factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genius on 15. 7. 21..
 */
public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		//다운캐스팅
		owners.add(((IDCard)product).getOwner());
	}

	public List getOwners() {
		return owners;
	}
}