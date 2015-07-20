package com.pearl.genius.iterator;

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
		Iterator it = bookShelf.iterater();

		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
