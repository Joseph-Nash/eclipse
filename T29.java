package test;

public class T29 {
	public static void main(String[] args){
		
		int josie[]={21,16,77,22,3};
		int sum=0;
		int average=0;
		
		
	for(int counter=0;counter<josie.length;counter++){
		sum+=josie[counter];
		average=sum/josie.length;
		
	}
	System.out.println("The sum of these ages is " + sum);
	
	System.out.println("The average age of your array is " /* sum/josie.length*/ + average);
	}
}
/* use this to do maths within an array
 * set up for loop - starting, parameters, increment
 * sum+= add the array value according to the counter number to the sum total
 */