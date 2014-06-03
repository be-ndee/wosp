package kontrollstrukturen;

import java.util.Scanner;

class BabylonischesWurzelziehen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		double x = 1;
		double xN = x;
		double betrag = x;
		
		while (betrag >= 0.000001) {
			xN = x;
			x = (x + (a / x)) / 2.0;
			betrag = Math.abs(x - xN);
			System.out.printf("%.6f (%.10f)\n", x, betrag);
		}
	}
}