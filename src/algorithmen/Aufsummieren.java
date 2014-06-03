package algorithmen;
import java.util.Scanner;

class Aufsummieren {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// while
		System.out.println("while iteraton");
		int summe = 0;
		int neueZahl = 0;
		while (neueZahl >= 0) {
			System.out.printf("Summe: %d\n", summe);
			System.out.println("Bitte geben Sie die Zahl ein, die Sie hinzu addieren wollen.\nFalls diese kleiner als 0 ist, wird der Vorgang abgebrochen.");
			neueZahl = scan.nextInt();
			if (neueZahl >= 0) {
				summe = summe + neueZahl;
			}
		}
		

		// do-while
		System.out.println("\ndo-while iteration");
		summe = 0;
		neueZahl = 0;
		do {
			summe = summe + neueZahl;
			System.out.printf("Summe: %d\n", summe);
			System.out.println("Bitte geben Sie die Zahl ein, die Sie hinzu addieren wollen.\nFalls diese kleiner als 0 ist, wird der Vorgang abgebrochen.");
			neueZahl = scan.nextInt();
		} while (neueZahl >= 0);
	}
}
