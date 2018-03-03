package com.pearl.genius.iterator;

import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

	private BookShelf bookShelf;

	@Before
	public void setUp() {
		bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("AAA"));
		bookShelf.appendBook(new Book("BBB"));
		bookShelf.appendBook(new Book("CCC"));
		bookShelf.appendBook(new Book("DDD"));
	}

	@Test
	public void iteratorTest() {
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
