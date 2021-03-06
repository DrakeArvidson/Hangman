package background;

import gui.HangFrame;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetListener implements ActionListener {
	
	HangFrame frame;
	
	public ResetListener(HangFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent event) {
		reset();
	}
	
	private void reset() {
		
		final Frame[] frames = Frame.getFrames();
		for (int i = 0; i < frames.length; i++) {
			frames[i].dispose();
		}
		
		new HangFrame();
	}

}
