package arrays;

import java.util.Scanner;
class Skalarprodukt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ask for vektor length
		System.out.println("\nlength?");
		int vektorLength = scan.nextInt();
		
		// create vektor 1
		System.out.println("\nvektor one?");
		double[] vektorOne = new double[vektorLength];
		for (int i = 0; i < vektorLength; i++) {
			 vektorOne[i] = scan.nextDouble();
		}
		
		// create vektor 2
		System.out.println("\nvektor two?");
		double[] vektorTwo = new double[vektorLength];
		for (int i = 0; i < vektorLength; i++) {
			 vektorTwo[i] = scan.nextDouble();
		}
		
		// calc scalar product
		double scalar = 0;
		for (int i = 0; i < vektorLength; i++) {
			scalar = scalar + (vektorOne[i] * vektorTwo[i]);
		}
		
		// print scalar product
		System.out.println(scalar);
	}
}
