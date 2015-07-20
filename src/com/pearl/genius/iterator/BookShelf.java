package com.pearl.genius.iterator;

/**
 * Created by genius on 15. 7. 17..
 */
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last = 0;

	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	public void appendBook(Book book) throws Exception {
		if (books.length > last) {
			this.books[last] = book;
			last++;
		} else {
			throw new ArrayIndexOutOfBoundsException("정해진 배열의 범위를 벗어났습니다.");
		}
	}

	public int getLength() {
		return last;
	}

	@Override
	public Iterator iterater() {
		return new BookShelfIterator(this);
	}
}
