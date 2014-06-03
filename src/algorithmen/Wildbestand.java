package algorithmen;

class Wildbestand {
	public static void main(String[] args) {
		double bestand = 200;
		int jahr = 0;
		while (bestand < 300) {
			bestand = bestand * 1.1 - 15;
			System.out.printf("Ende Jahr %d:, Bestand: %.0f\n", jahr, bestand);
			jahr++;
		}
	}
}
