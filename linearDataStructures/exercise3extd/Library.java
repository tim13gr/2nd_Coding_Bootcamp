package exercise3extd;

public class Library {
	//private static Book[] books;
	private BookList bookList;
	
	public BookList getBookList() {
		return bookList;
	}

	public void setBookList(BookList bookList) {
		this.bookList = bookList;
	}
	Library(BookList booklist) {
		this.bookList = booklist;
	}
/*
	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	Library(Book[] books) {
		this.books = books;
	}

	public static void printAvailableBooks() {
		int num=0;
		for (int x = 0; x < books.length; x++) {
			if (books[x].isAvailable()) {
				num +=1;
				System.out.println((num)+". "+books[x].toString());
			}
		}
	}

	public static void printBookDetails(String checkBook) {
		int test=0;
		for (int x = 0; x < books.length; x++) {
			if (books[x].getTitle().equals(checkBook)) {
				System.out.println(checkBook+" found! Details: "+books[x].toString());
				test+=1;
			}
		}
		if(test==0){
		System.out.println(checkBook+ " does not exist");
		}
	}

	public static void printBookFromAuthor(String author) {
		int test=0;
		for (int x = 0; x < books.length; x++) {
			if (books[x].getAuthor().getName().equals(author)) {
				test+=1;
				System.out.println("Book with author :'"+author+"' found! Details: "+books[x]);

			}
		}
		if(test==0){
		System.out.println("Book with author :'"+author+"' not found");}
	}

	public static void printTheMostPopularBook() {
		int countRents = 0;
		int z = 0;
		for (int x = 0; x < books.length; x++) {
			if (books[x].getTimesRented() > countRents) {
				countRents = books[x].getTimesRented();
				z = x;
			}
		}
		System.out.println("Most popular book: " +books[z]);
	}*/

	
}
