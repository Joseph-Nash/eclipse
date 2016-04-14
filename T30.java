package test;

import java.util.Random;

public class T30 {
/*	public static void main(String[] args){
		Random rand = new Random();
		int freq[]=new int[7];
		
		for(int roll=1;roll<1000;roll++){
			++freq[1+rand.nextInt(6)];
++freq adds one whenever it hits said number - counts hits in an array
		}
			System.out.println("Face\tFrequency");
			
			for(int face=1;face<freq.length;face++){
				System.out.println(face+"\t"+freq[face]);
			}
		
	}
}
public static void main(String[] args){
	Random rand2 = new Random(); creates a new random object from the util
	int freq2[] =new int[25]; creates a new array with 25 integers 0-24
	
	for(int roll2=1;roll2<100;roll2++){ creates a for loop where the dice rolls 1-1000 times, incrementing 1 each time
		++freq2[1+rand2.nextInt(24)]; every time a random number is generated, the number is added to a tally in the array
	}
	System.out.println("Face\t Frequency of each role"); prints the header

	for(int face2=1;face2<freq2.length;face2++){ prints out a table for face parameters incrementing by one
		System.out.println(face2+"\t" +freq2[face2]); face number, tab, then the number of tallies for each face
	}
}
}*/

public static void main(String[] args){
	Random rand = new Random();
	int freq[] = new int[11];
	
	for(int roll=1;roll<100;roll++){
		++freq[1+rand.nextInt(10)];
	}
	System.out.println("Face\t Frequency");
	
	for(int face=1;face<freq.length;face++){
		System.out.println(face+"\t"+freq[face]);
	}
	}
	
}