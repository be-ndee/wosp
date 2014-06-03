package klassen;
import java.util.Arrays;

class Complex {
	// vars real and imagine part of a complexe number
	private double real;
	private double imag;
	
	// constructor
	Complex() {}
	
	Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	// getter for real and imag
	double getRealteil() { return real; }
	double getImaginaerteil() { return imag; }
	
	// methods for addition, subtraction, multiplication and division with another complex number
	Complex add(Complex zahl) {
		double newReal = real + zahl.getRealteil();
		double newImag = imag + zahl.getImaginaerteil();
		
		Complex newComplex = new Complex(newReal, newImag);
		return newComplex;
	}
	
	Complex sub(Complex zahl) {
		double newReal = real - zahl.getRealteil();
		double newImag = imag - zahl.getImaginaerteil();
		
		Complex newComplex = new Complex(newReal, newImag);
		return newComplex;
	}
	
	Complex mult(Complex zahl) {
		double newReal = (real * zahl.getRealteil()) - (imag * zahl.getImaginaerteil());
		double newImag = (real * zahl.getImaginaerteil()) + (imag * zahl.getRealteil());
		
		Complex newComplex = new Complex(newReal, newImag);
		return newComplex;
	}
	
	Complex div(Complex zahl) {
		double newReal = ((real * zahl.getRealteil()) + (imag * zahl.getImaginaerteil())) / ((zahl.getRealteil() * zahl.getRealteil()) + (zahl.getImaginaerteil() * zahl.getImaginaerteil()));
		double newImag = ((imag * zahl.getRealteil()) - (real * zahl.getImaginaerteil())) / ((zahl.getRealteil() * zahl.getRealteil()) + (zahl.getImaginaerteil() * zahl.getImaginaerteil()));
		
		Complex newComplex = new Complex(newReal, newImag);
		return newComplex;
	}
	
	// calculates the 'betrag' of the complex number and returns it
	double getBetrag() {
		double betrag = Math.sqrt((real * real) + (imag * imag));
		return betrag;
	}
	
	boolean kleiner(Complex zahl) {
		return (zahl.getBetrag() >= this.getBetrag());
	}
	
	// returns an info-String
	public String toString() {
		String info = "Komplexe Zahl z: z=" + real + "+" + imag + "*i";
		return info;
	}
}