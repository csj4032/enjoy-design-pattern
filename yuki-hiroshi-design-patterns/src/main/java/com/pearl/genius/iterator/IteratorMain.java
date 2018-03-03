package com.pearl.genius.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genius on 15. 7. 20..
 */
public class IteratorMain {

	public static void main(String[] args) throws Exception {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("AAA"));
		bookShelf.appendBook(new Book("BBB"));
		bookShelf.appendBook(new Book("CCC"));
		bookShelf.appendBook(new Book("DDD"));
		Iterator it = bookShelf.iterator();

		List list = new ArrayList<>();
		list.iterator();

		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}