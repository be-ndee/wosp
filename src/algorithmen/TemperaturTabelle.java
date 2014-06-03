package algorithmen;

class TemperaturTabelle {
	public static void main (String[] args) {
		int fahrenheit = 0;
		double celcius = 0.0;
		System.out.println("Fahrenheit I Celcius");
		while (fahrenheit <= 300) {
			celcius = (5.0 / 9.0) * (fahrenheit - 32);
			System.out.printf("%d I %.2f\n", fahrenheit, celcius);
			fahrenheit = fahrenheit + 20;
		}
	}
}
