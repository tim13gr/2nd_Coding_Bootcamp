package interfaces_ex2;

public class Shape implements Agreeable {
	public int width;
	public int height;
	
	public boolean isSmallerThan(Agreeable shape){
		Shape b = (Shape) shape;
		if(this.calcArea() < b.calcArea()){
			return true;
		}else{
			return false;
		}
	}
	
	Shape(){
		super();
	}

	Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	int calcArea(){
		return this.width*this.height;
	}
	public static void main (String[] args){
		Shape shape1= new Shape(5,5);
		Shape shape2= new Shape(4,4);
		System.out.println(shape1.calcArea());
		System.out.println("shape1 is smaller than shape2 :"+shape1.isSmallerThan(shape2));
	}

}
