package background;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

public class CancelController implements ActionListener {
	
	SolveController input;
	
	public CancelController(SolveController input) {
		this.input = input;
	}
	
	public void actionPerformed(ActionEvent event) {
		
Window w = SwingUtilities.getWindowAncestor(input.getSolveButton());
		
		if (w != null) {
			w.setVisible(false);
		}
		
	}

}
