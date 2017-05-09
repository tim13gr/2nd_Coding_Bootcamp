package exercise3extd;

import java.util.LinkedList;
import java.util.ArrayList;

public class BookList {
	public Book firstBook;
	public static LinkedList<Book> BookList;

	BookList() {
		firstBook = null;
	}

	public void addElement(Book c) {
		if (this.firstBook == null) {
			this.firstBook = c;
		} else {
			Book current_book = this.firstBook;
			while (current_book != null) {
				current_book = firstBook;
			}
			current_book.setNext(c);
		}
	}

	public boolean exists(String title) {
		for (int i = 0; i < BookList.size(); i++) {
			if (BookList.get(i).getTitle() == title) {
				return true;
			}
		}
		return false;
	}

	public void addBook(Book newBook) {
		if (!exists(newBook.getTitle())) {
			BookList.add(newBook);
		} else {
			System.out.println("The Book already exists");
		}
	}

	public void removeBook(String title) {
		for (int i = 0; i < BookList.size(); i++) {
			if (exists(title)) {
				BookList.remove(BookList.get(i));
			}
		}
	}

	public static void printAvailableBooks() {
		for (int i = 0; i < BookList.size(); i++) {
			if (BookList.get(i).isAvailable()) {
				System.out.println("The" + BookList.get(i) + "is available");
			}
		}
	}

	public static void printBookDetails(String title) {
		for (int i = 0; i < BookList.size(); i++) {
			if (BookList.contains(title)) {
				System.out.println(BookList.get(i).toString());
			}
		}
	}

	public static void printBookFromAuthor(String author) {
		for (int i = 0; i < BookList.size(); i++) {
			if (BookList.contains(author)) {
				System.out.println(BookList.get(i).getTitle());
			}
		}
	}

	public static void printTheMostPopularBook() {
		int max = 0;
		Book max_i = BookList.get(0);
		for (int i = 0; i < BookList.size(); i++) {
			if (BookList.get(i).getTimesRented() > max) {
				max = BookList.get(i).getTimesRented();
				max_i = BookList.get(i);
			}
		}
		System.out.println("The most popular book is" + max_i.getTitle());
	}

}