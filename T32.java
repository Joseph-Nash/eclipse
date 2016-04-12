package test;

public class T32 {
	public static void main(String[] args){
		int josie[]={1,2,3,4,5,6,7};
		change(josie); /* this is calling to the change method, where 5 is added to each variable*/
		
		for(int y:josie) /*updated array is now known as y, where it is printed on screen*/
			System.out.println(y);
	}
	/* go outside your main method*/
	
	public static void change(int x[]){ /* array is now known as x, where 5 will be added to each of the values*/
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;
	}
	
}
 