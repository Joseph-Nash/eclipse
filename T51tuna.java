package test;

import java.awt.FlowLayout; //deals with formatting across the screen
import javax.swing.JFrame; //
import javax.swing.JLabel; 
// some of these make it look like a normal windows style box with minimise, maximise and exit

public class T51tuna extends JFrame { //tuna will take info from the JFrame
	
	private JLabel item1; //constructor is JLabel
	
	public T51tuna(){
		super("The title bar");
		setLayout(new FlowLayout()); //gives the default layout
		
		item1 = new JLabel("This is a sentence wooow"); //the label outputted
		item1.setToolTipText("look at this magic"); //when hovered
		add(item1); //has to be added for it to come up
	}
}
