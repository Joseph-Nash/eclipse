package test;

import java.util.*;

public class T79 {
	public static void main(String[] args){
		
		final Formatter x; //outputs strings to a file like printf but to a file
		//exception handling below!
		try{
			x = new Formatter("freddo.txt"); //like doing final Formatter x = new Formatter
			System.out.println("you created a file");
			
		}//no file existing then it will create it for you
		catch(Exception e){
			System.out.println("you got an error buddo");
		}
		//creates the txt file from wherever you run the program
		
		//absolute paths can be added ("C:\\.......\\freddo.txt")
	}
	//try and catch for - /0, or string/number incompatibility
}
