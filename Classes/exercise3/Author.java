package exercise3;

public class Author {
	private String name;
	
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
}
	

