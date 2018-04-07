package com.pearl.genius.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

	private Database() {

	}

	public static Properties getProperties(String dbName) {
		var filename = "/Users/genius/Worksapce/enjoy-design-pattern/yuki-hiroshi-design-patterns/src/main/java/com/pearl/genius/facade/" + dbName + ".txt";
		var prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}