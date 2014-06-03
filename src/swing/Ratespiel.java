package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ratespiel extends JFrame implements ActionListener  {
	
	File file = new File("C:\\file.txt");
	

	JFrame frame = new JFrame("Ratespiel");

	JLabel player = new JLabel("Playername");
	JLabel num = new JLabel("Insert number between 1 and 1000");

	JButton newGame = new JButton("New Game");
	JButton ok = new JButton("Ok");
	JButton best = new JButton("Best Player");
	JButton exit = new JButton("Exit");

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();

	JTextField textPlayer = new JTextField("Player1", 20);
	JTextField output = new JTextField("", 40);
	JTextField textNum = new JTextField(null, 20);
	
	int number = (int) ((Math.random() * 999 + 1));
	int counter = 0;

	GridLayout gl = new GridLayout(4, 2);

	public Ratespiel() throws IOException {
		
		newGame.addActionListener(this);
		ok.addActionListener(this);
		best.addActionListener(this);
		exit.addActionListener(this);

		frame.setLayout(gl);

		panel1.add(player);
		panel1.add(textPlayer);

		panel2.add(num);
		panel2.add(textNum);

		panel3.add(newGame);
		panel3.add(ok);
		panel3.add(best);
		panel3.add(exit);

		panel4.add(output);

		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == newGame) {
			number = (int) ((Math.random() * 100000 % 1000) + 1);
			this.counter = 0;
			textPlayer.setText("Player1");
			textNum.setText("");
			output.setText("");
		}
		if (e.getSource() == ok) {
			if (!textNum.getText().isEmpty())
				try {
					guessNum(Integer.parseInt(textNum.getText()));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		if (e.getSource() == best) {

		}
		if (e.getSource() == exit) {
			frame.dispose();
		}

	}

	public static void main(String[] args) {
		
			try {
				new Ratespiel();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

	public void guessNum(int num) throws IOException {
		this.counter++;
		
		if (num < number) {
			output.setText("Try" + this.counter +". too low!");

		}
		if (num > number) {
			output.setText("Try" + this.counter +". too high!");
		}
		if (num == number) {
			output.setText("Try " + this.counter +". exactly!");
			FileWriter fw = new FileWriter(file, true);
			fw.write(textPlayer.getText() + " " + this.counter);
			fw.flush();
			fw.close();
			
		}
	}

}
