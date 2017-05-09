package exercises1to4;

public class Ex1 {
	public static void main(String args[]) {
		System.out.println(bootCamp(25, 91));
		System.out.println(bootCamp(91, 25));
	}

	public static int bootCamp(int number1, int number2) {
		if (number1 < number2) {
			int y = number2 - number1;
			int x = Math.abs(y);
			int z = (int) Math.sqrt(x);
			return (z);
		} else {
			int w = number1 + number2;
			return (w);
		}
	}
}
