package com.pearl.genius.abstractFactory;

import com.pearl.genius.abstractFactory.factory.Factory;
import com.pearl.genius.abstractFactory.factory.Link;
import com.pearl.genius.abstractFactory.factory.Page;
import com.pearl.genius.abstractFactory.factory.Tray;
import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryTest {

	private Factory factory;
	private FactoryManager manager;

	@Before
	public void setUp() {
		manager = FactoryManager.getInstance();
		factory = manager.getFactory("list");
		factory = manager.getFactory("table");
	}

	@Test
	public void abstractFactoryTest() {
		Link joins = factory.createLink("중앙일보", "http://www.joins.com");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com");

		Link us_yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
		Link kr_yahoo = factory.createLink("Yahoo! Korea", "https://www.yahoo.com/");

		Link excite = factory.createLink("Excite", "https://www.excite.co.jp/");
		Link google = factory.createLink("Google", "https://www.google.co.kr/");

		Tray trayNews = factory.createTray("신문");
		trayNews.add(joins);
		trayNews.add(chosun);

		Tray trayYahoo = factory.createTray("Yahoo!");
		trayYahoo.add(us_yahoo);
		trayYahoo.add(kr_yahoo);

		Tray traySearch = factory.createTray("Yahoo!");
		traySearch.add(trayYahoo);
		traySearch.add(excite);
		traySearch.add(google);

		Page page = factory.cretePage("LinkPage", "genius.choi");
		page.add(trayNews);
		page.add(traySearch);
		page.output();
	}
}