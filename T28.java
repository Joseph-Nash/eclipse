package test;

public class T28 {
	public static void main(String[] args){
		
		System.out.println("Index\tValue");
		int josie[]={32,12,18,54,2};
		
		for(int counter=0;counter<josie.length;counter++){
			System.out.println(counter + "\t" + josie[counter]);
		}
	}
}
/* print a line for formatting
 * create an array initialiser with 5 values in this case
 * create variable counter and use .length tool so it will change as the array changes
 * set counter, set limits and set step length
 * print out the counter and then value of the array
 * \t works as a tab command
 * */
