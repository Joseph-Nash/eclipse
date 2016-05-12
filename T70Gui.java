package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class T70Gui extends JFrame{
	
	private JList list;
	private static String[] colornames = {"black", "blue", "red", "white"};
	private static Color[] colors = {Color.ORANGE, Color.GRAY, Color.YELLOW, Color.PINK};
	
	
	public T70Gui(){
		super("TITLLLE");
		setLayout(new FlowLayout());
		
		list = new JList(colornames); // a list of the colornames
		list.setVisibleRowCount(4); //how many they can see by default
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // allows only one thing to be selected
		add(new JScrollPane(list)); // list to the window
		
		list.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent event){
						//custom stuff starts now
						getContentPane().setBackground(colors[list.getSelectedIndex()]); //this only works if you have the colors matched up with colornames
				
					}
				}
				
				
				
				);
		
		}

}
