package interfaces_ex1;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	public void resize(double percentage){
		 this.radius=this.radius*percentage/100;
		 }	
	public static void main (String[] args){
		ResizableCircle circle1= new ResizableCircle(1);
		circle1.getPerimeter();
		circle1.getArea();
		circle1.resize(2);
		circle1.getPerimeter();
		circle1.getArea();
	}
}