package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class BodyMassIndex extends JFrame implements ActionListener {

	//Create all frames and all childs
	JFrame frame = new JFrame("Body-Mass-Index");
	JFrame warn = new JFrame();
	//
	JLabel weight = new JLabel("weight in kg:", 10);
	JLabel height = new JLabel("height in m:", 10);
	JLabel bmi = new JLabel("BMI:");
	JLabel wrongInsInt = new JLabel("Wrong insert! 0 is not allowed! ");
	JLabel wrongInsStr = new JLabel("Strings are not allowed either!");
	JLabel wrongInsComma = new JLabel("try to use '.' instead of ','");

	JTextField textHeight = new JTextField("1.80", 10);
	JTextField textWeight = new JTextField("80", 10);
	JTextField textBmi = new JTextField("20", 12);
	JTextField output = new JTextField("normal weight", 20);

	ButtonGroup bg = new ButtonGroup();

	JRadioButton male = new JRadioButton("male");
	JRadioButton female = new JRadioButton("female");

	JButton buttonCalc = new JButton("calculate!");
	JButton buttonConfirm = new JButton("ok! I'm not stupid!");

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	//create a GridLayout for panels
	GridLayout gl = new GridLayout(6, 1);

	//Default Constructor - build all frames and add all childs
	public BodyMassIndex() {
		//sets male to DefaultRadioButton
		male.setSelected(true);
		//add RadioButtons male and female to a buttongroup named bg
		bg.add(male);
		bg.add(female);
		
		// adds the Actionlistener to the buttonCalc;
		buttonCalc.addActionListener(this);

		//sets the GridLayout to the mainframe
		frame.setLayout(gl);
		
		// add stuff to the panels
		panel1.add(weight);
		panel1.add(textWeight);

		panel2.add(height);
		panel2.add(textHeight);

		panel3.add(male);
		panel3.add(female);

		panel4.add(buttonCalc);

		panel5.add(bmi);
		panel5.add(textBmi);

		panel6.add(output);

		//add panels to the mainframe
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);

		//automatically size the frame and set it visible
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//sets frame to warn due to a wrong insert
		warn.setLayout(new GridLayout(4, 1));
		warn.setTitle("ERROR");
		warn.add(wrongInsInt);
		warn.add(wrongInsStr);
		warn.add(wrongInsComma);
		warn.add(buttonConfirm);
		warn.pack();
		
		buttonConfirm.addActionListener(this);

	}
	//handles the incoming events
	@Override
	public void actionPerformed(ActionEvent e) {

		
		//calculates the BMI if height > 0, otherwise sets the frame warn visible
		if (e.getSource() == buttonCalc) {
			
			double height = 0;
			double weight = 0;
			double result = 0;

			height = checkAndParse(textHeight.getText());
			weight = checkAndParse(textWeight.getText());

			if (height > 0) {
				result = weight / (height * height);
				result = Math.round(100.0 * result) / 100.0;

				textBmi.setText(Double.toString(result));
				setStatement(male.isSelected(), result);
			} else {

				warn.setVisible(true);

			}
		}
		//if the event is caused by the button buttonConfirm, set frame warn invisible
		if (e.getSource() == buttonConfirm) {
			warn.setVisible(false);
		}

	}

	public static void main(String[] args) {

		new BodyMassIndex();
	}
	//checks the result and sets the output

	public void setStatement(boolean b, double result) {
		if (b == true) {
			if (result < 20) {
				output.setText("underweight");
			} else if (result >= 20 && result <= 25) {
				output.setText("normal weight");
			} else if (result > 25 && result <= 30) {
				output.setText("overweight");
			} else if (result > 30 && result <= 40) {
				output.setText("Adipositas");
			} else if (result > 40) {
				output.setText("OMG! WHATS WRONG WITH YOU!");
			}
		} else {
			if (result < 19) {
				output.setText("underweight");
			} else if (result >= 19 && result <= 24) {
				output.setText("normal weight");
			} else if (result > 24 && result <= 30) {
				output.setText("overweight");

			} else if (result > 30 && result <= 40) {
				output.setText("Adipositas");

			} else if (result > 40) {
				output.setText("OMG, WHAT'S WRONG WITH YOU?");
			}

		}
	}
	//tries to parse the String to double and returns the value
    // if parsing is not possible, the method returns -1
	public double checkAndParse(String s) {
		double d = -1;
		try {
			d = Double.parseDouble(s);
			return d;
		} catch (Exception e) {
			System.out.println("parse not possible!");
		}
		return d;
	}
}
