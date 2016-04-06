package test;

import java.util.Scanner;

public class T15 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		T15c T15cObject = new T15c ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		T15cObject.simpleMessage(name); 

/*within this class, look for the method that is simplemessage
 * the T15cObject is used to call the other class, which is connected by declaring that T15c T15cObject = new T15c ();
 */
		
	}
}
