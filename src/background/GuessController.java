package background;

import gui.InputPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class GuessController implements ActionListener {
	
	InputPanel input;
	
	public GuessController(InputPanel input) {
		this.input = input;
	}
	
	public void actionPerformed(ActionEvent event) {
		String guessedLetter = input.getGuess();
		if (guessedLetter.length() > 1) {
			JOptionPane.showMessageDialog(input, "Please guess only one letter", "Invalid Guess", JOptionPane.ERROR_MESSAGE);
		}
		
		else if(guessedLetter.length() == 0) {
			JOptionPane.showMessageDialog(input, "Please enter a letter", "Invalid Guess", JOptionPane.ERROR_MESSAGE);
		}
		//check for guessed letter in the Word
	}

}
