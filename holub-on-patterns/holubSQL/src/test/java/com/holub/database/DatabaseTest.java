package com.holub.database;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatabaseTest {

	private BufferedReader sql;

	@Before
	public void setUp() throws IOException {
		sql = new BufferedReader(new FileReader("D:\\workspace\\enjoy-designPattern\\holub-on-patterns\\holubSQL\\src\\test\\resources\\Database.test.sql"));
	}

	@Test
	public void test() throws IOException {
		Database database = new Database();

		String test;
		while ((test = sql.readLine()) != null) {
			test = test.trim();

			if (test.length() == 0)
				continue;

			while (test.endsWith("\\")) {
				test = test.substring(0, test.length() - 1);
				test += sql.readLine().trim();
			}

			System.out.println("Parsing: " + test);
			Table result = database.execute(test);

			if (result != null)
				System.out.println(result.toString());
		}
	}
}