package com.pearl.genius.adapter;

/**
 * Created by genius on 15. 7. 20..
 */
public class PrintBannerTrust extends PrintTrust{

	private Banner banner;

	public PrintBannerTrust(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
