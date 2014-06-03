package swing;

import javax.swing.*;



public class GrundkomponentenFrame extends JFrame {

public GrundkomponentenFrame() {
	
	String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };

	
	JComboBox petList = new JComboBox(petStrings);
	petList.setSelectedIndex(4);
	JButton button1 = new JButton("JButton");
	JToolTip tt = new JToolTip();
	tt.setTipText("Ja ne ist klar");
	button1.setToolTipText("Ja Ne ist klar");
	
	this.setTitle("Einige Swing-Grundkomponenten");
	JPanel pan = new JPanel();
	JPanel pan2 = new JPanel();
	
	pan.add(new JLabel("Hallo"));
	pan.add(new JTextField("JTextField"));
	pan.add((button1));
	pan.add(new JToggleButton("JToggleButton"));
	pan.add(new JCheckBox("JCheckBox"));
	pan.add(petList);
	
	ButtonGroup bg = new ButtonGroup();
	
	JRadioButton b1 = new JRadioButton("Radio 1");
	JRadioButton b2 = new JRadioButton("Radio 2");
	JRadioButton b3 = new JRadioButton("Radio 3");
	
	bg.add(b1);
	bg.add(b2);
	bg.add(b3);
	
	pan.add(b1);
	pan.add(b2);
	pan.add(b3);
	
	
	
	this.add(pan);
	//this.add(pan2);
	this.pack();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setVisible(true);
	
	
}
public static void main(String[] args) {
	new GrundkomponentenFrame();
}
	
}
