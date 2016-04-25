package test;

import java.awt.FlowLayout; // deals with formatting
import java.awt.event.ActionListener; // waits for a command when something is typed or clicked etc
import java.awt.event.ActionEvent; //acts upon the listener
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class T52tuna extends JFrame{
	
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public T52tuna(){
		super("The Titular Title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("enter text here ya butt");
		add(item2);
		
		item3 = new JTextField("uneditable butt", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		T52thehandler handler = new T52thehandler(); //create an object for addActionListener to use
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	private class T52thehandler implements ActionListener{ //listener on something - waiting for an event, then do some code
		
		public void actionPerformed(ActionEvent event){
			
			String string = "";
			
			if(event.getSource()==item1)//you press enter in item1 you show field
				string=String.format("field 1: %s", event.getActionCommand());
			
			else if(event.getSource()==item2)
			string=String.format("field 2: %s", event.getActionCommand());
			
			else if(event.getSource()==item3)
			string=String.format("field 3: %s", event.getActionCommand());
			
			else if(event.getSource()==passwordField)
			string=String.format("Password field: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);	//shows the box in the end
		}
	}

}