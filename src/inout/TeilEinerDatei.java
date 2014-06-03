package inout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TeilEinerDatei {

	public static void main(String[] args) throws IOException {
		int i = 0;
		int zahlen[];

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Daten\\Studium\\programmieren\\dir\\zahlen.txt"));
		BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\Daten\\Studium\\programmieren\\dir\\zahlen.txt"));
		while (br.ready()) {
			 br.readLine();
			 i++;
			 
		}
		System.out.println("I ist: " +i);
		zahlen = new int[i];
		i=0;
		br.close();
		while (reader.ready())
		{
			
		zahlen[i]=Integer.parseInt(reader.readLine());
		i++;
		}
		int sum = zahlen[3]+zahlen[4]+zahlen[5];
		System.out.println(sum);
		
	}
}
