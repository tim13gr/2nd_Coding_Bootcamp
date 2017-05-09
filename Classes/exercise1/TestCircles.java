package exercise1;

public class TestCircles {
	public static void main(String[] arrg) {
		Circle newc1 = new Circle();
		newc1.printCircleDetails();
		Circle newc2 = new Circle(3, 3, 3);
		newc2.printCircleDetails();
		Circle newc3 = new Circle(1, 1);
		newc3.printCircleDetails();
		// step 7+8 calculateArea-calculatePerimeter
		System.out.println("Area is " + newc3.calculateArea());
		System.out.println("Perimeter is " + newc3.calculatePerimeter());
		// step 9 copy constructor
		Circle copy1 = new Circle(5, 4, 10);
		Circle copy2 = new Circle(copy1);
		copy1.printCircleDetails();
		copy2.printCircleDetails();
		copy1 = new Circle(3, 3, 3);
		copy1.printCircleDetails();
		copy2.printCircleDetails();
		// step 10 cocentric
		System.out.println("Circles are cocentric : "+copy1.cocentric(copy1, newc2));
		// step 11 numberOfCreatedCircles
		System.out.println("Number Of Created Circles : "+Circle.count);
	}
}
