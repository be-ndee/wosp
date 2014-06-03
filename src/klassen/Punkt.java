package klassen;

class Punkt {
	private double xCoord;
	private double yCoord;
	
	Punkt() {
		
	}
	
	Punkt(double x, double y) {
		xCoord = x;
		yCoord = y;
	}
	
	// setter for x and y
	void setXCoord(double x) {
		xCoord = x;
	}
	void setYCoord(double y) {
		yCoord = y;
	}
	
	// getter for x and y
	public double getYCoord() {
		return yCoord;
		}
	public double getXCoord() {
		return xCoord;
	}
	
	public String toString() {
		String info = "Punkt mit x=" + xCoord + ", y=" + yCoord;
		return info;
	}
	
	public double abstandUrsprung() {
		return Math.sqrt(xCoord*xCoord + yCoord*yCoord);
	}
	
	public Punkt spiegelXAchse() {
		Punkt gespiegelterPunkt = new Punkt(-xCoord, yCoord);
		return gespiegelterPunkt;
	}

	public Punkt spiegelYAchse() {
		Punkt gespiegelterPunkt = new Punkt(xCoord, -yCoord);
		return gespiegelterPunkt;
	}
	
	public Punkt spiegelUrsprung() {
		Punkt gespiegelterPunkt = new Punkt(-xCoord, -yCoord);
		return gespiegelterPunkt;
	}
	
	public double abstandZuPunkt(Punkt punkt) {
		double x = xCoord - punkt.getXCoord();
		double y = yCoord - punkt.getYCoord();
		return Math.sqrt(x*x + y*y);
	}
}