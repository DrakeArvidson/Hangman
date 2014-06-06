package background;

import gui.InputPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SolveController implements ActionListener {
	
	InputPanel input;
	private JButton solveButton = new JButton("Solve");
	JButton cancelButton = new JButton("Cancel");
	JPanel panel = new JPanel();
	JTextField solveField = new JTextField(10);
	private String solveAttempt;
	SolveConfirmController solveConfirm = new SolveConfirmController(this);
	CancelController cancelController = new CancelController(this);
	
	public SolveController(InputPanel input) {
		
		this.input = input;
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("If you attempt to solve and get it wrong you lose!"));
		panel.add(new JLabel("Enter your guess below and hit Solve"));
		panel.add(solveField);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		//want to cause the solve button to prompt a second window, asking to solve or cancel
		solveButton.addActionListener(solveConfirm);
		cancelButton.addActionListener(cancelController);
		
		Object[] buttons = {solveButton, cancelButton};
		
		JOptionPane.showOptionDialog(
				input, 
				panel, 
				"Warning", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				buttons, 
				buttons[0]);
		
		//System.out.println(solveAttempt);
		
	}
	
	public void setSolveAttempt(String solveGuess) {
		solveAttempt = solveGuess;
	}
	
	public String getSolveAttempt() {
		return solveAttempt;
	}
	
	public JButton getSolveButton() {
		return solveButton;
	}

}
