package klassen;
class Polynom {
	private double a;
	private double b;
	private double c;
	
	Polynom() {
		
	}
	
	Polynom(double aParam, double bParam, double cParam) {
		a = aParam;
		b = bParam;
		c = cParam;
	}
	
	double getA() {
		return a;
	}
	
	double getB() {
		return b;
	}
	
	double getC() {
		return c;
	}
	
	String toSring() {
		String info = "Polynom: " + a + "x^2 + " + b + "x + " + c;
		return info;
	}
	
	double calcY(double x) {
		double y = a*x*x + b*x + c;
		return y;
	}
	
	Polynom addPolynom(Polynom poly) {
		Polynom newPoly = new Polynom((a + poly.getA()), (b + poly.getB()), (c + poly.getC()));
		return newPoly;
	}
	
	Polynom subPolynom(Polynom poly) {
		Polynom newPoly = new Polynom((a - poly.getA()), (b - poly.getB()), (c - poly.getC()));
		return newPoly;
	}
	
	Polynom multSkalar(double skalar) {
		Polynom newPoly = new Polynom((a * skalar), (b * skalar), (c * skalar));
		return newPoly;
	}
	
	double[] calcZero() {
		double[] zeros = new double[2];
		// calcs the underRoot value 
		// => if it is smaller than 0, there aren't zero points, else calc the zeros
		double disk = (b*b) - (4.0*a*c);
		if (disk < 0) {
			zeros = null;
		} else {
			double xOne = ((-b) + Math.sqrt(disk)) / (2.0*a);
			double xTwo = ((-b) - Math.sqrt(disk)) / (2.0*a);
			zeros[0] = xOne;
			zeros[1] = xTwo;
		}
		return zeros;
	}
}