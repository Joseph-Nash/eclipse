package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T68Gui extends JFrame{
	
	private JComboBox box; //drop down list
	private JLabel picture;//what you call pictures
	
	private static String[] filename = {"b.png", "c.png"};//stores the path name
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};//stores the files themselves

	public T68Gui(){
		super("THE TITLE");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename); //drop down with options b and c .png
		box.addItemListener(
				//anonymous innerclass - implements item listener class
				new ItemListener(){
					public void itemStateChanged(ItemEvent event){
						if(event.getStateChange()==ItemEvent.SELECTED); // what was selected?
						picture.setIcon(pics[box.getSelectedIndex()]); // will choose depending on dropdown. i guess because they are the same array number
					}
				}
				
				);
		
		add(box);
		picture = new JLabel(pics[0]);
		add(picture);
		
	}
	
}
