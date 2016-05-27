package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T84 extends JPanel{
	
	public void paintComponent(Graphics g){ //built in method paintComponent, Graphics is a method
		super.paintComponent(g);
		this.setBackground(Color.RED);
		
		g.setColor(Color.GREEN);
		g.fillRect(50, 50, 500, 300);
		
		g.setColor(new Color(81, 190, 55));
		g.fillRect(60, 60, 480, 280);
		
		g.setColor(Color.ORANGE);
		g.drawString("POKEMONNN",250, 200);
		
	}
	
	
	
	
}
