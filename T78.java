package test;

import java.io.File;

public class T78 {
	public static void main(String[] args){
		
		File x = new File("C:\\Users\\jnash\\Learning\\test\\src\\joe.txt");//constructor takes path of the file
		
		if(x.exists())
			System.out.println(x.getName() + " exists wahoo!"); //get name is useful
		else
			System.out.println("This thing doesn't exist buddo");
	}

}
