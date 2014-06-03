package klassen;

class Bankkonto {
	private String vorname;
	private String nachname;
	private double kontostand;
	private double limit;
	
	Bankkonto() {
		
	}

	Bankkonto(String vor, String nach, double stand, double lim) {
		vorname = vor;
		nachname = nach;
		kontostand = stand;
		limit = lim;
	}
	
	public String toString() {
		String info = "Bankkonto von " + vorname + " " + nachname + ": Stand=" + kontostand + ", Limit=" + limit;
		return info;
	}
	
	public void einzahlung(double wert) {
		kontostand = kontostand + wert;
	}
	
	public void auszahlung(double wert) {
		double zukunftStand = kontostand - wert;
		if (zukunftStand <= limit) {
			double ausz = kontostand - limit;
			kontostand = limit;
			System.out.println("Das Limit wurde erreicht. Restauszahlung: " + ausz);
		} else if (zukunftStand >= limit) {
			kontostand = kontostand - wert;
			System.out.println("Auszahlung erfolgreich: " + wert);
		}
	}
	
	public double getKontostand() {
		return kontostand;
	}
}