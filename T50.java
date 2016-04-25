package test;

import javax.swing.JOptionPane; //used to created GUI

public class T50 {
	public static void main(String[] args){ //used to create input box
		String fn = JOptionPane.showInputDialog("Enter the first number");
		String sn = JOptionPane.showInputDialog("Enter the second number");
		
		int num1 = Integer.parseInt(fn); //command converts the string fn and sn to integers
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " +sum, "Super Number Adder", JOptionPane.PLAIN_MESSAGE);
		// formatting?, what is printed out, title and ???
		
	}
	
	
}
