package algorithmen;

class Einmaleins {
	public static void main(String[] args) {
		int links = 1;
		int oben = 1;
		
		System.out.printf("|  x  |");
		while (oben <= 10) {
			neueZelle(oben);
			oben++;
		}
		oben = 1;
		
		int ergebnis;
		while (links <= 10) {
			System.out.printf("\n");
			neueZelle(links);
			while (oben <= 10) {
				ergebnis = links * oben;
				neueZelle(ergebnis);
				oben++;
			}
			oben = 1;
			links++;
		}
	}
	
	public static void neueZelle(int zahl) {
		if (zahl < 10) {
			System.out.printf("|   %d |", zahl);
		} else if (zahl < 100) {
			System.out.printf("|  %d |", zahl);
		} else {
			System.out.printf("| %d |", zahl);
		}
	}
}
