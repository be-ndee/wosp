package swing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class JFileChooserDemo {
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser fc = new JFileChooser(); // File-Chooser erstellen
		fc.setFileFilter(new FileFilter() {
			@Override
			public boolean accept(File f) {
				return f.isDirectory()
						|| f.getName().toLowerCase().endsWith(".txt");
			}
			
			@Override
			public String getDescription() {
				
				return "Texte";
			}
		});
		int state = fc.showOpenDialog(null);// Varianten öffnen / zeigen
//		 int state = fc.showSaveDialog(null);// Variante speichern
		// int state = fc.showDialog(null, "Löschen");// freie Variante
		if (state == JFileChooser.APPROVE_OPTION) // Öff./Spei./Lösch.
			{System.out.println(fc.getSelectedFile().getAbsolutePath());
			
	        String file = fc.getSelectedFile().getAbsolutePath();
		    
		    try {
				FrameMitText f = new FrameMitText("Datei", "800", "600", file );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("FEHLER ALTER!");
			}
		    
			}
		else
			System.out.println("Auswahl abgebrochen");
	}
}
