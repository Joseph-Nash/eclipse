package test;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class T62Gui extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public T62Gui(){
		super("The title");
		setLayout(new FlowLayout());
		
		reg = new JButton("regular button baybee");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon c = new ImageIcon(getClass().getResource("c.png"));
		custom = new JButton("Custom", b);
		custom.setRolloverIcon(c);
		add(custom);
	
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}

}
