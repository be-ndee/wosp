package string;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Palindrom {
	public static void main(String[] args) throws IOException {

		String crlf = System.lineSeparator();
		File dir = new File("C:\\Daten\\Studium\\programmieren\\dir");
		dir.mkdir();
		File ps = new File(dir, "pds.txt");
		ps.createNewFile();
		dir.deleteOnExit();

		FileWriter fw = new FileWriter(ps);

		String text = "1";
		int test=1;

		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie einen Text ein. Abbruchbedingung ist 0");

		while (test!=0) {
			try {
				text = scan.next();
				test = Integer.parseInt(text);
			}
			catch (NumberFormatException e)
			{
				test =1;
			}
			finally {
			
			StringBuilder reversedText = new StringBuilder("");

			int length = text.length();

			for (int i = 0; i < length; i++) {
				reversedText.insert(0, text.charAt(i));
			}

			System.out.printf("Original: %s\n", text);
			System.out.printf("Umgedreht: %s\n", reversedText);

			String ins = "Eingabe: " + text + " Umgedreht: " + reversedText
					+ crlf;
			fw.write(ins);

			if (text.equalsIgnoreCase(reversedText.toString())) {
				System.out.println("Palindrom JA!");
			} else {
				System.out.println("Palindrom NEIN!");
			}
		}
		fw.flush();
		
	}
		fw.close();
}
}