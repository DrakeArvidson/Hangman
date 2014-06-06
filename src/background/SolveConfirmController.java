package background;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

public class SolveConfirmController implements ActionListener {
	
	SolveController input;
	
	public SolveConfirmController(SolveController input) {
		this.input = input;
	}
	
	public void actionPerformed(ActionEvent event) {
		
		//get the entered text in solve attempt
		input.setSolveAttempt(input.solveField.getText());
		Window w = SwingUtilities.getWindowAncestor(input.getSolveButton());
		
		if (w != null) {
			w.setVisible(false);
		}
		
	}

}
