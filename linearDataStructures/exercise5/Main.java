package exercise5;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array = { 1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1 };
		findMinAndPositions(array);
	}

	public static void findMinAndPositions(int[] array) {
		int min = Arrays.stream(array).min().getAsInt();
		System.out.print("Min is " + min + " in positions: ");
		for (int x = 0; x < array.length; x++) {
			if (array[x] == min) {
				System.out.print(x + ", ");
			}
		}
	}
}
