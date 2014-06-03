package swing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameMitText extends JFrame {

	String title;
	int width;
	int height;
	String filename;

	public FrameMitText(String title, String width, String height, String fileName)
			throws IOException {

		this.filename = fileName;
		
		if(checkInt(width))
		{
		this.width = Integer.parseInt(width);
		}
		else 
		{
		System.out.println("wrong width");
		}
		if (checkInt(height))
		{
		this.height =Integer.parseInt(height);
		}
		else 
		{
		System.out.println("wrong height");
		}
		this.title = title;

		JScrollPane scrollpane = new JScrollPane(new JTextArea(scanFile(fileName)));
		this.add(scrollpane);

		this.setTitle(title);
		this.setSize(this.width, this.height);
		this.setVisible(true);

	}

	public static void main(String[] args) throws IOException {
		
		

		new FrameMitText(args[0], args[1], args[2], args[3]);
	}

	public String scanFile(String fileName) throws IOException {
		String str = "";
		String temp;
		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while ((temp =  br.readLine()) != null)
		{
			str = str + "\n" +temp;
		}
		return str;
	}
	public boolean checkInt(String str)
	{
		try
		{
			Integer.parseInt(str);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		
		
		
	}
}
