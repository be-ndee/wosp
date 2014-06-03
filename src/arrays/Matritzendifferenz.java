package arrays;

import java.util.Scanner;

class Matrizendifferenz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// aks for rows and columns
		System.out.println("rows?");
		int rows = scanner.nextInt();
		System.out.println("columns?");
		int columns = scanner.nextInt();
		
		// create 2 randomMatrixes and the targetMatrix
		double[][] matrixOne = randomMatrix(rows, columns);
		double[][] matrixTwo = randomMatrix(rows, columns);
		double[][] matrixTarget = randomMatrix(rows, columns);
		
		// calc the differences from matrixOne and matrixTwo
		// and save in matrixTarget
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				matrixTarget[r][c] = matrixOne[r][c] - matrixTwo[r][c];
			}
		}
		// output the matrixes
		outputMatrix(matrixOne);
		System.out.print("\n\n");
		outputMatrix(matrixTwo);
		System.out.print("\n\n");
		outputMatrix(matrixTarget);
	}
	
	// creates matrix with size of countRows and countColumns with random values
	public static double[][] randomMatrix(int countRows, int countColumns) {
		double[][] matrix = new double[countRows][countColumns];
		for (double[] row : matrix) {
			for (int i = 0; i < row.length; i++) {
				row[i] = Math.random() * 100.0;
			}
		}
		return matrix;
	}

	public static void outputMatrix(double[][] matrix) {
		for (double[] row : matrix) {
			for (double value : row) {
				System.out.print(value + "  ");
			}
			System.out.println();
		}
	}
}
