package interfaces_ex1;

class Circle implements Shape{
	protected double radius;
	public final double p=3.14;
	
	Circle(double radius){
		this.radius=radius;
	}
	public void getPerimeter(){
		System.out.println(2*p*radius);		
	}
	 public void getArea(){
		 System.out.println(p *radius*radius);
	 }
	
}
