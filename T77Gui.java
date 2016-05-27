package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T77Gui extends JFrame{

	private String details;
	private JLabel statusbar;
	
	public T77Gui(){
		super("TUTLE");
		statusbar = new JLabel("THIS IS DEFAULT");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent event){
			details = String.format("you clicked %d ", event.getClickCount());
			
			if(event.isMetaDown())
				details += "with the right mouse button";
			else if(event.isAltDown())
				details += "with the centre mouse button";
			else 
				details += "with the left mouse button";
			
			statusbar.setText(details);
		}
	}
	
}
