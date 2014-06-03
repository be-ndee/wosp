package string;

import java.util.Scanner;

class RoemischeZahl {
	public static void main(String[] args) {
		RoemischeZahl converter = new RoemischeZahl();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Zahl eingeben");
		String text = scan.next();
		
		System.out.println(converter.valueOfStringWithSubtraction(text));
	}
	
	// returns the int value of a whole string
	// NO subtraction rule
	public int valueOfStringWithoutSubtraction (String str) {
		int length = str.length();
		int value = 0;
		for (int i = 0; i < length; i++) {
			value += valueOfChar(str.charAt(i));
		}
		return value;
	}
	
	// returns the int value of a whole string
	// WITH subtraction rule
	public int valueOfStringWithSubtraction (String str) {
		int length = str.length();
		int value = 0;
		str = stringFromString(str);
		System.out.println(str);
		for (int i = 0; i < length; i++) {
			value += valueOfChar(str.charAt(i));
		}
		return value;
	}
	
	// returns a new String, where the subractions are replaced
	// with "normal" chars
	public String stringFromString (String str) {
		String newStr = str;
		String[] find = {"IV", "IX", "XL", "XC", "CD", "CM"};
		String[] replace = {"IIII", "VIIII", "XXXX", "LXXXX", "CCCC", "DCCCC"};
		for (int i = 0; i < find.length; i++) {
			newStr = newStr.replace(find[i], replace[i]);
		}
		return newStr;
	}
	
	// returns the int value of a single char
	public int valueOfChar(char c) {
		switch (c) {
			case 'M': return 1000;
			case 'D': return 500;
			case 'C': return 100;
			case 'L': return 50;
			case 'X': return 10;
			case 'V': return 5;
			case 'I': return 1;
		}
		return 0;
	}
}