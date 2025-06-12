package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {

		int[] numbers = {
				1, 4, 20, 8, 70, 10, 9, 5, 14, 11, 15
		};

		Arrays.sort(numbers);

		System.out.println(Arrays.toString(numbers));

		System.out.println(Arrays.binarySearch(numbers, 10));
		System.out.println(Arrays.binarySearch(numbers, 15));
		System.out.println(Arrays.binarySearch(numbers, 100));

		int[] result01 = Arrays.copyOf(numbers, 5);
		System.out.println(Arrays.toString(result01));

		int[] result02 = Arrays.copyOfRange(numbers, 5, 10);
		System.out.println(Arrays.toString(result02));

	}
}
