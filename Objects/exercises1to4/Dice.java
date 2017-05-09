package exercises1to4;

public class Dice {
	public static void main(String args[]) {
		roll();
	}

	public static void roll() {
		int num = 0;
		int x, y;
		do {
			num += 1;
			x = (int) (Math.random() * 6 + 1);
			y = (int) (Math.random() * 6 + 1);
		} while (x != 1 || y != 1);
		System.out.println("The number of rolls until both dices are 1 is: " + num);
	}
}