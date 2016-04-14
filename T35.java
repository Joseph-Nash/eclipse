package test;

public class T35 {
	public static void main(String[] args){
		System.out.println("The average is "+average(1,2,3,4,5,6));
	}

/*	
	public static int average(int...numbers){
		int total=0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
	}
}
*/

	public static int average(int...numbers){
		int total=0;
				for(int x:numbers)
					total+=x;
		return total/numbers.length;
	}
}
