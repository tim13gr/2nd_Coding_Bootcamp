package exercise3extd;

public class Author {
	private String name;
	private Author[] authorArray;
	
	public void setName(String name){ 
		this.name = name;   
		}  
	public String getName() {
		return name;
	}
	public String toString() {
		return getName();
	}
	Author(String newname){
		setName(newname);
	}
	Author(Author[] authorArray){
		this.setAuthorArray(authorArray);
	}
	public Author[] getAuthorArray() {
		return authorArray;
	}
	public void setAuthorArray(Author[] authorArray) {
		this.authorArray = authorArray;
	}
}
	

