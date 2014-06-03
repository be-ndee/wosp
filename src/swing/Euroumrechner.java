package swing;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Euroumrechner extends JFrame implements ActionListener {

	JButton button1 = new JButton("Abbrechen");
	JButton button2 = new JButton("DM -> EUR");
	JButton button3 = new JButton("EUR -> DM");
	
	JTextField tf = new JTextField("Bitte hier Betrag um Umrechnen eingeben!");

	JFrame frame = new JFrame();

	public Euroumrechner() {

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		frame.add(button1, BorderLayout.EAST);

		frame.add(button2, BorderLayout.CENTER);
		frame.add(button3, BorderLayout.WEST);
		frame.add(tf,BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Euroumrechner();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button1) {
			frame.dispose();
		} 
		if (e.getSource() == button2) {
			
			double erg = 0;
			
			if(checkNumberDouble(tf.getText()))
			{
				erg = Double.parseDouble(tf.getText());
				erg = erg / 1.95583;
				String str = Double.toString(erg);
				tf.setText(str);
				
			}
			else
			{
				System.out.println("is not a number!");
			}
			
			
			
		} 
		if (e.getSource() == button3) {
			double erg = 0;
			if(checkNumberDouble(tf.getText()))
			{
				erg = Double.parseDouble(tf.getText());
				erg = erg * 1.95583;
				String str = Double.toString(erg);
				tf.setText(str);
			}
			else
			{
				System.out.println("is not a number!");
			}
		}

	}
	
	public boolean checkNumberDouble(String s)
	{
		try
		{
			double d = Double.parseDouble(s);
			return true;
		}
		catch (NumberFormatException n)
		{
			return false;
		}
		
	}

}
