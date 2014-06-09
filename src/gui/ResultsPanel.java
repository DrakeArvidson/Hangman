package gui;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ResultsPanel extends JPanel{

	JTextArea guessedLetters = new JTextArea();
	
	public ResultsPanel() {
		super();
		JPanel panelA = new JPanel();
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		panelA.setLayout(new BoxLayout(panelA, BoxLayout.Y_AXIS));
		panelA.add(new JLabel("Letters guessed so far: "));
		
		guessedLetters.setLineWrap(true);
		guessedLetters.setWrapStyleWord(true);
		guessedLetters.setText("one, two, three, four, five, six, seven, eight");		
		guessedLetters.setMaximumSize(new Dimension(200, 100));
		panelA.add(guessedLetters);
		
		this.add(panelA);
	}
}
