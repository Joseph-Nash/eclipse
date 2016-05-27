package test;

import java.io.*;
import java.lang.*;
import java.util.*;

public class T80createfile {

		private Formatter x;
		
		public void openFile(){
			try{
				x = new Formatter("chinese.txt");
			}
			catch(Exception e){
				System.out.println("You have an error");
			}
		}
		
		public void addRecord(){
			x .format("%s%s%s", "20 ", "Josie ", "Joe");
		}
		
		public void closeFile(){
			x.close(); //need to close for housekeeping, windows usually closes but sometimes it can keep file open
		}
	}

