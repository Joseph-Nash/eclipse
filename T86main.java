package test;

import javax.swing.*;
import java.awt.*;

public class T86main {
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("TITLE");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		T86 peachy = new T86();
		peachy.setBackground(Color.WHITE);
		f.add(peachy);
		f.setSize(500, 270);
		f.setVisible(true);
		
		
	}

}
