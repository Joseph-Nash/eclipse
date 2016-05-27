package test;

import javax.swing.*;

public class T84main {
	public static void main(String[] args){
		
	JFrame f = new JFrame("Title");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	T84 peachy = new T84();
	f.add(peachy);
	f.setSize(600, 400);
	f.setVisible(true);
	
	}
}
