package files;

import java.io.*;

public class FilesAufgabe {
	public static void main(String[] args) {
		File testdir = new File("C:\\Daten\\Studium\\programmieren\\testdir");
		// System.out.println("\\");
		testdir.mkdir();
		File mydir = new File(testdir, "myDir");
		mydir.mkdir();
		System.out.println(mydir.getAbsolutePath().toString());

		for (int i = 1; i < 4; i++) {
			File datei = new File(mydir, "foo" + i);
			try {
				datei.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();

			}
			String[] li = mydir.list();
			for (String file : li)
			{
				System.out.println(file);
			}
		}
	}

}
