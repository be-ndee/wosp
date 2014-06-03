package arrays;

import java.util.Scanner;

class Bubblesort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// array length
		System.out.println("array length");
		int length = scanner.nextInt();
		double[] array = new double[length];
		
		// create array
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextDouble();
		}
		
		// sort array
		sortArray(array);
		
		// show array
		for (double element : array) {
			System.out.println(element);
		}
	}
	
	public static double[] sortArray(double[] source) {
		for (double element : source) {
			for (int i = 0; i < source.length-1; i++) {
				if (source[i+1] < source[i]) {
					double smaller = source[i+1];
					source[i+1] = source[i];
					source[i] = smaller;
				}
			}
		}
		return source;
	}
}