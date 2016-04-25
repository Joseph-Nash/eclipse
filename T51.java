package test;

import javax.swing.JFrame; //gives basic windows features

public class T51 {
	public static void main(String[] args){
		
		T51tuna tunaObject = new T51tuna();
		tunaObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//determines how the program will close
		tunaObject.setVisible(true); //will only appear if true
		tunaObject.setSize(275,275); // size of the box
		
	}
}
