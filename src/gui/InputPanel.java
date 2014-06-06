package gui;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import background.GuessController;
import background.SolveController;

public class InputPanel extends JPanel {
	
	JTextField guessField = new JTextField();
	JButton guessButton = new JButton("Guess!");
	JButton solveButton = new JButton("Solve");
	GuessController guessController = new GuessController(this);
	SolveController solveController = new SolveController(this);
	String solveAttempt;
	
	public InputPanel() {
		super();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
		panelA.add(new JLabel("Guess a letter:  "));
		guessField.setMaximumSize(new Dimension(50, 25));
		panelA.add(guessField);
		
		panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
		panelB.add(guessButton);
		panelB.add(solveButton);
		
		guessButton.addActionListener(guessController);
		solveButton.addActionListener(solveController);
		
		
		this.add(panelA);
		this.add(panelB);
	}
	
	public String getGuess() {
		return guessField.getText();
	}
	

}
