package kontrollstrukturen;

import java.util.Scanner;

class Schuhgroesse {
	public static void main(String[] args) {
		System.out.println("Zentimeter            | Schuhgroesse");
		System.out.println("------------------------------------");
		
		double cm;
		int s = 30;
		while (s <= 50) {
			double klein = (s - 1) / 1.5;
			double gross = s / 1.5;
			System.out.printf("%.6f - %.6f | %d\n", klein, gross, s);
			s++;
		}
	}
}