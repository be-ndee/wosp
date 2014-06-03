package arrays;

class MittelwertStandardabweichung {
	public static void main(String[] args) {
		int arrayLength = 100;
		double[] numbers = new double[arrayLength];
		for (int n = 0; n < arrayLength; n++) {
			numbers[n] = Math.random() * 10;
		}
		
		for (double element : numbers) {
			System.out.println(element);
		}
		
		// calc middle
		double sum = 0.0;
		for (double value : numbers) {
			sum = sum + value;
		}
		double mittel = (1.0 / arrayLength) * sum;
		System.out.println("Mittelwert: " + mittel);
		
		// calc standard
		sum = 0.0;
		for (double value : numbers) {
			sum = sum + Math.pow((value - mittel), 2);
		}
		double underRoot = (1.0 / (arrayLength - 1)) * sum;
		double standard = Math.sqrt(underRoot);
		System.out.println("Standardabweichung: " + standard);
	}
}