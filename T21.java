package test;

import java.util.Scanner;

public class T21 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		int nopapes;
		
		System.out.println("How many papers do you have? ");
		nopapes = input.nextInt();
		System.out.println("Please enter the grades for your papers");
		
		while (counter < nopapes){
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total/nopapes;
		System.out.println("Your average is "+ average);
		
	}
	
	
	
}
