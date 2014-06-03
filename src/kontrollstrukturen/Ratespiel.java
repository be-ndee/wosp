package kontrollstrukturen;

import java.util.Scanner;

class Ratespiel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String bestName = "";
		int bestTries = 0;
		boolean newGame = true;
		
		while (newGame) {
			System.out.println("Geben Sie bitte Ihren Name ein: ");
			
			String name = scan.next();
			int tries = 0;
			int randInt = (int) (Math.random()*100 + 1);
			
			boolean advised = false;
			
			while (!advised) {
				System.out.println("Geben Sie bitte eine Zahl aus dem Bereich 1 bis 100 ein: ");
				int number = scan.nextInt();
				tries++;
				if (number == randInt) {
					advised = true;
					System.out.printf("Versuch Nr. %d: Sie haben die Zahl erraten!!!", tries);
				} else if (number < randInt) {
					System.out.printf("Versuch Nr. %d: %d zu klein!", tries, number);
				} else if (number > randInt) {
					System.out.printf("Versuch Nr. %d: %d zu gross!", tries, number);
				}
			}
			
			if (tries < bestTries) {
				bestName = name;
				bestTries = tries;
			}
			
			boolean endInput = true;
			while (endInput) {
				System.out.println("Wollen Sie das Spiel beenden (0), fortsetzen (1)oder das bisher beste Spiel ausgeben lassen (2)?");
				int endInt = scan.nextInt();
				
				switch (endInt) {
					case 0:
						newGame = false;
						endInput = false;
						break;
					case 1:
						newGame = true;
						endInput = false;
						break;
					case 2:
						System.out.println("Bisher beste/r Spieler/in: " + bestName + ", geringste Anzahl Versuche: " + bestTries);
						break;
				}
			}
		}
	}
}