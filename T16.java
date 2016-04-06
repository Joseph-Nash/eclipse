package test;

import java.util.Scanner;

public class T16 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		T16c T16cObject = new T16c();
		System.out.println("Enter name of first girlfriend here: ");
		String temp = input.nextLine();
		T16cObject.setName(temp);
		T16cObject.saying();
	}
}
