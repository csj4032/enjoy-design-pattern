package com.pearl.genius.builder;

/**
 * Created by Administrator on 2015-07-28.
 */
public abstract class Builder {

	public abstract void makeTitle(String title);

	public abstract void makeString(String str);

	public abstract void makeItems(String[] items);

	public abstract void close();
}
