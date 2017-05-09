package exercise3extd;

public class Librarian {
	private Library library;
	public Library getLibrary() {
			return library;
		}

		public void setLibrary(Library library) {
			this.library = library;
		}

		Librarian(Library library) {
			this.setLibrary(library);
		}
		
		public static void findMeBooksFromAuthor(String name) {
			//Receives an author name and delegates the request to the library's printBooksFromAuthor method
			BookList.printBookFromAuthor(name);
		}
		
		public static void findMeAvailableBooks() {
			//Delegates the request to the library's printAvailableBooks method
			BookList.printAvailableBooks();
		}
		
		public static void findMeBook(String title) {
			//Receives a book's title and delegates the request to the library's printBookDetails method
			BookList.printBookDetails(title);
		}

		public static void findMostPopularBook() {
		//Delegates the request to the library's printTheMostPopularBook method
			BookList.printTheMostPopularBook();
		}
}
