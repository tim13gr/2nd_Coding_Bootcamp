package exercise3;

public class Librarian {
	private Library library;
	
	Librarian(Library library){
		this.library=library;
	}
	public void findMeBooksFromAuthor(String author){
		Library.printBookFromAuthor(author);
		}

	public void findMeAvailableBooks(){
		Library.printAvailableBooks();
	}
	public void findMeBook(String checkBook){
		Library.printBookDetails(checkBook);
	}
	public void findMostPopularBook(){
		Library.printTheMostPopularBook();
	}
}
