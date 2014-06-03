package arrays;

class Eratostenes {
	public static void main(String[] args) {
		// create sieb-array
		int count = 20;
		int[] sieb = new int[count - 1];
		for (int i = 2; i <= count; i++) {
			sieb[i-2] = i;
		}
		
		int[] prims = new int[count-2];
		int min;
		int pos = 0;
		
		// checking-while
		while (!arrayEmpty(sieb)) {
			min = minIntInArray(sieb);
			prims[pos] = min;
			pos++;
			removeIntFromArray(min, sieb);
		}
		
		// show prims
		System.out.println("prims:");
		for (int value : prims) {
			if (value == 0) {
				break;
			}
			System.out.println(value);
		}
	}
	
	// returns the smallest int in the array
	public static int minIntInArray(int[] array) {
		int min = -1;
		for (int value : array) {
			if ((value < min) && (value > 0) || (min == -1)) {
				min = value;
			}
		}
		return min;
	}
	
	// set arrayElement = -1
	// IF element is equal to i OR element can be divided by i
	public static void removeIntFromArray(int i, int[] array) {
		for (int pos = 0; pos < array.length; pos++) {
			if (array[pos] == i) {
				array[pos] = -1;
			} else if ((array[pos] % i) == 0) {
				array[pos] = -1;
			}
		}
	}
	
	// checks if array is empty (only contains -1)
	public static boolean arrayEmpty(int[] array) {
		for (int value : array) {
			if (value > 0) {
				return false;
			}
		}
		return true;
	}
}