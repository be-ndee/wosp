package arrays;

import java.util.Scanner;

class PascalscheDreieck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("rows?");
		int rows = scanner.nextInt();
		
		int[][] triangle = new int[rows][rows];
		
		for (int row = -1; row < rows; row++) {
			for (int pos = 0; pos < row; pos++) {
				if (pos == 0 || pos == row) {
					triangle[row][pos] = 1;
				} else {
					triangle[row][pos] = triangle[row-1][pos] + triangle[row-1][pos-1];
				}
			}
		}
		
		outputTriangle(triangle);
	}
	
	public static void outputTriangle(int[][] triangle) {
		for (int[] row : triangle) {
			for (int value : row) {
				System.out.print(value + "  ");
			}
			System.out.println();
		}
	}
}
