package kontrollstrukturen;

import java.util.Scanner;

class QuadratischeGleichung {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// the user should input 3 doubles (a, b and c)
		System.out.println("Geben Sie a ein.");
		double a = scan.nextDouble();
		
		System.out.println("Geben Sie b ein.");
		double b = scan.nextDouble();
		
		System.out.println("Geben Sie c ein.");
		double c = scan.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
				System.out.println("Die Gleichung ist degeneriert.");
			} else {
				double x = -(c/ b);
				System.out.println("x: " + x);
			}
		} else {
			// check if the discriminante is bigger or equal 0
			double d = b * b - 4.0 * a * c;
			if (d >= 0) {
				// calculate x1 and x2 and print it out
				double xOne = (-b + Math.sqrt(d)) / (2 * a);
				double xTwo = (-b - Math.sqrt(d)) / (2 * a);
				System.out.println("x1: " + xOne);
				System.out.println("x2: " + xTwo);
			} else {
				System.out.println("Die Loesung ist konjugiert komplex.");
			}
		}
	}
}