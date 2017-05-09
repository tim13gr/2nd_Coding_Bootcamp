package exercise3;

public class Book {
	private String title;
	private Author author;
	private final String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
		public void setPhysicalCopies(int physicalCopies) {
		this.physicalCopies = physicalCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	public void setTimesRented(int timesRented) {
		this.timesRented = timesRented;
	}
	public String getTitle() {
		return title;
	}	
	public Author getAuthor() {
		return author;
	}
	public String getIsbn(){
		return isbn;
	}
	public int getPhysicalCopies(){
		return physicalCopies;
	}
	public int getAvailableCopies(){
		return availableCopies;
	}
	public int getTimesRented(){
		return timesRented;
	}
	public String toString(){
		return "Book [title="+title +","+ 
		" author="+author.toString()+","+
		" isbn="+isbn+","+
		" physicalCopies="+physicalCopies+","+
		" availableCopies="+availableCopies+","+
		" timesRented="+timesRented+"]";
		}
	public void rentPhysicalCopy(){
		if (this.physicalCopies==0){
			System.out.println("Book unavailable");
		}else{
			System.out.println("Book available");
			availableCopies-=1;
		}
	}
	public boolean isAvailable(){
		if(this.availableCopies>=1){
			return(true);
		}else{
			return(false);			
		}
	}
	public boolean hasAuthor(String gname){
		if(gname.equals(author)){
			return(true);
		}else{
			return(false);
		}
	}
	Book(String title, Author author, String isbn,int physicalCopies, int availableCopies,int timesRented) { 
		 this.title = title; 
		 this.author = author;     
		 this.isbn = isbn; 
		 this.physicalCopies=physicalCopies;
		 this.availableCopies= availableCopies;
		 this.timesRented= timesRented;
				}
	
}
