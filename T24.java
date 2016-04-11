package test;

public class T24 {
	public static void main(String[] args){
		
		/* this one will still do the first print of system, then stop, rather than not print anything at all */
		
		int counter = 15;
		
		do{
			System.out.println(counter);
			counter++;
			System.out.println(counter);
		}while(counter <=10);
		
	
	int counter2 = 200;
	
	do{
		System.out.println(counter2);
		counter2++;
	}while(counter <=10);
	
	}
}
