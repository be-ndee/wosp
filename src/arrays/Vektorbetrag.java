package arrays;

import java.util.Scanner;

class Vektorbetrag {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// vektor length
		System.out.println("\nlength?");
		int vektorLength = scan.nextInt();
		
		// create vektor
		System.out.println("\nvektor?");
		double[] vektor = new double[vektorLength];
		for (int i = 0; i < vektorLength; i++) {
			 vektor[i] = scan.nextDouble();
		}
		
		// calc underRoot value
		double underRoot = 0;
		for (int i = 0; i < vektorLength; i++) {
			underRoot = underRoot + (vektor[i] * vektor[i]);
		}
		
		// calc the root
		System.out.println(Math.sqrt(underRoot));
	}
}
