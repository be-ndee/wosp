package swing;

import java.awt.BorderLayout;

import javax.swing.*;


public class Editor extends JFrame {
	
	public Editor() {
		JFrame frame = new JFrame();
		
		JMenuItem fileNew = new JMenuItem("Neu...");
		JMenuItem fileOpen = new JMenuItem("÷ffnen...");
		JMenuItem fileClose = new JMenuItem("Schlieﬂen");
		JMenuItem fileSave = new JMenuItem("Speichern");
		JMenuItem fileSaveAs = new JMenuItem("Speichern unter...");
		JMenuItem fileSaveAsWeb = new JMenuItem("Als Website speichern...");
		JMenuItem fileSearch = new JMenuItem("Suchen...");
		JMenuItem fileVersion = new JMenuItem("Versionen...");
		
		JMenuItem fileWebPreview = new JMenuItem("Webseitenvorschau");
		JMenuItem fileLayout = new JMenuItem("Seite einrichten");
		JMenuItem fileView = new JMenuItem("Seitenansicht");
		JMenuItem filePrint = new JMenuItem("Drucken...");
		JMenuItem fileSendAs = new JMenuItem("Senden an");
		
		JMenuItem fileProperties = new JMenuItem("");
		JMenuItem fileLast1 = new JMenuItem();
		JMenuItem fileLast2 = new JMenuItem();
		JMenuItem fileLast3 = new JMenuItem();
		JMenuItem fileExit = new JMenuItem("Beenden");
		
		
		
		
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("Datei");
		
		
		file.add(fileNew);
		file.add(fileOpen);
		file.add(fileSave);
		file.add(new JSeparator());
		file.add(fileSaveAs);
		file.add(fileSaveAsWeb);
		file.add(fileSearch);
		file.add(new JSeparator());
		file.add(fileVersion);
		file.add(new JSeparator());
		file.add(fileWebPreview);
		file.add(fileLayout);
		file.add(filePrint);
		file.add(fileSendAs);
		file.add(fileProperties);
		file.add(fileLast1);
		file.add(fileLast2);
		file.add(fileLast3);
		file.add(fileExit);
		frame.setJMenuBar(menubar);


		
		
		

		
		menubar.add(file);
		
		
		
		
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Editor();
	}

}
