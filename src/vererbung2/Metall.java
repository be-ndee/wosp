package vererbung2;

public class Metall extends Element {

	boolean isHalbmetall;
	double leitFhgk;
	@Override
	public String toString() {
		String info = super.toString();
		info = info +"\nist ein Halbmetall: " + isHalbmetall +
				"\nLeitfähigkeit: "+ leitFhgk
				+"\n====================\n";
		
		return info;
	}
	public boolean isHalbmetall() {
		return isHalbmetall;
	}
	public void setHalbmetall(boolean isHalbmetall) {
		this.isHalbmetall = isHalbmetall;
	}
	public double getLeitFhgk() {
		return leitFhgk;
	}
	public void setLeitFhgk(double leitFhgk) {
		this.leitFhgk = leitFhgk;
	}
	Metall() {
		super();
		
	}
	Metall(String name, String symbol, int oz, char schale, int aggzu,
			boolean ismain, boolean isHalbmetall, double leitFhgk) {
		super(name, symbol, oz, schale, aggzu, ismain);
		this.isHalbmetall=isHalbmetall;
		this.leitFhgk=leitFhgk;
		
	}
	
	
	
}
