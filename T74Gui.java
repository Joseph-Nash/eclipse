package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T74Gui extends JFrame {
		private JPanel mousepanel;
		private JLabel statusbar;
		
		public T74Gui(){
			super("DIS IS TITLE");
			
			mousepanel = new JPanel();
			mousepanel.setBackground(Color.WHITE);
			add(mousepanel, BorderLayout.CENTER);
			
			statusbar =new JLabel("default");
			add(statusbar, BorderLayout.SOUTH);
			
			Handlerclass handler = new Handlerclass();
			mousepanel.addMouseListener(handler);
			mousepanel.addMouseMotionListener(handler);
			
		}
		
		private class Handlerclass implements MouseListener, MouseMotionListener{
			public void mouseClicked(MouseEvent event){
				statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
			}
			public void mousePressed(MouseEvent event){
				statusbar.setText("You pressed down the mouse");
			}
			public void mouseReleased(MouseEvent event){
				statusbar.setText("You released the mouse from your clutches");
			}
			public void mouseEntered(MouseEvent event){
				statusbar.setText("You entered the forbidden area");
				mousepanel.setBackground(Color.MAGENTA);
			}
			public void mouseExited(MouseEvent event){
				statusbar.setText("The mouse has left the building");
				mousepanel.setBackground(Color.WHITE);
			}
			// these are mouse motion events
			public void mouseDragged(MouseEvent event){
				statusbar.setText("Woah stop dragging this!?");
			}
			public void mouseMoved(MouseEvent event){
				statusbar.setText("I'm FREEEEEE!");
			}
}
}
