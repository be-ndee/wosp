package arrays;

class Fibonacci {
	public static void main(String[] args) {
		double[] twenty = fibonacci(20);
	}
	
	public static double[] fibonacci(int amount) {
		double[] values = new double[amount];
		
		values[0] = 1;
		values[1] = 1;
		
		for (int i = 2; i < amount; i++) {
			values[i] = values[i-1] + values[i-2];
		}
		
		System.out.println(values[amount-1]);
		return values;
	}
}