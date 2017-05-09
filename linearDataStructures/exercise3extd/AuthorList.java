package exercise3extd;

import java.util.ArrayList;

public class AuthorList {
	private ArrayList<Author> authorList = new ArrayList<>();

	public AuthorList(Author authorsArray[]) {
		for (int i = 0; i < authorsArray.length; i++) {
			this.authorList.add(authorsArray[i]);
		}
	}

	public void addAuthor(Author author) {
		if (authorList.contains(author)) {
			System.out.println("author exists");
		} else {
			authorList.add(author);
		}
	}

	public String toString() {
		return "AuthorList [authorList = " + authorList + "]";
	}
}