package test;

import java.util.Random;

public class T26 {
	public static void main(String[] args){
		Random dice = new Random();
		int number;
		for(int counter=1; counter<=10; counter++){
			number = 1+dice.nextInt(6); /* would use 0-5 if it wasn't for the 1+ at the start*/
			System.out.println(number + "   ");
		}
		
		
	}
}
