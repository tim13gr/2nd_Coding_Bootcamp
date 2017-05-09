package exercise1;

public class Circle {
	private int x;
	private int y;
	private int radius;
	private static final double ð = 3.14;
	public static int count;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	Circle() {
		this.x = 0;
		this.y = 0;
		this.radius = 5;
		count += 1;
	}

	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		count += 1;

	}

	public void printCircleDetails() {
		System.out.println("I'm a circler at point (" + x + "," + y + ") with radius " + radius);
	}

	Circle(int x, int y) {
		this();
		this.x = x;
		this.y = y;

	}

	public double calculateArea() {
		double e = ð * radius * radius;
		return (e);
	}

	public double calculatePerimeter() {
		double p = 2 * ð * radius;
		return (p);
	}

	public Circle(Circle original) {
		this(original.x, original.y, original.radius);
	}

	public boolean cocentric(Circle first, Circle second) {
		if (first.getX() == second.getX() && first.getY() == second.getY()) {
			return (true);
		} else {
			return (false);
		}
	}
}