package string;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Quersumme {
	public static void main(String[] args) throws IOException {
		File testdir = new File("C:\\Daten\\Studium\\programmieren\\testdir");
		File qs = new File(testdir, "quersumme.txt");
		try {
			qs.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}

		Scanner scan = new Scanner(System.in);

		// zahl als String einlesen
		System.out.println("Geben Sie eine Zahl ein.");
		String myString = new String(scan.next());
		int length = myString.length();
		int sum = 0;
		
		FileWriter fw = new FileWriter(qs);
		
		

		

		String zwischenInt = "";
		// berechnet die quersumme
		for (int i = 0; i < length; i++) {
			zwischenInt = String.valueOf(myString.charAt(i));
			sum += Integer.parseInt(zwischenInt);
			
		}

		System.out.println(sum);
		fw.write("Eingabe: "+myString + " Quersumme: "+sum +"\n");
		fw.flush();
	}
}