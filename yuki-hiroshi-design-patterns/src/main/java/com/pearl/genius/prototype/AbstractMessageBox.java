package com.pearl.genius.prototype;

import com.pearl.genius.prototype.framework.MessageBox;

public abstract class AbstractMessageBox implements MessageBox {

	protected String decorateString;

	public AbstractMessageBox(String decorateString) {
		this.decorateString = decorateString;
	}

	@Override
	public MessageBox createClone() {
		MessageBox p = null;
		try {
			p = (MessageBox) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}