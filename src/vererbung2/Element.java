package vererbung2;

public class Element {

	String name;
	String symbol;
	int oz;
	char schale;
	int aggzu;
	boolean ismain;

	Element() {
	}

	Element(String name, String symbol, int oz, char schale, int aggzu,
			boolean ismain) {
		this.name = name;
		this.symbol = symbol;
		this.oz = oz;
		this.schale = schale;
		this.aggzu = aggzu;
		this.ismain = ismain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getOz() {
		return oz;
	}

	public void setOz(int oz) {
		this.oz = oz;
	}

	public char getSchale() {
		return schale;
	}

	public void setSchale(char schale) {
		this.schale = schale;
	}

	public int getAggzu() {
		return aggzu;
	}

	public void setAggzu(int aggzu) {
		this.aggzu = aggzu;
	}

	public boolean isIsmain() {
		return ismain;
	}

	public void setIsmain(boolean ismain) {
		this.ismain = ismain;
	}

	public String toString() {
		String info = "";
		info = info + "Name: " + name + "\nSymbol: " + symbol
				+ "\nOrdnungszahl: " + oz + "\nSchale: " + schale
				+ "\nAggregatzustand: " + aggzu + "\nHauptgruppe: " + ismain
				+ "\n---------------------------------------\n";

		return info;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Element) {
			Element e = (Element) o;
			return this.oz == e.oz;
		} else
			return false;
	}
}
