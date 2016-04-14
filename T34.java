package test;

public class T34 {
	public static void main(String[] args){
		int firstarray[][]={{1,2,3,4,5},{6,7,8,9,10}};
		int secondarray[][]={{5,2,7,4,2},{234,234,6546,3}};
		
		System.out.println("This is the first array");
		display(firstarray);
		
		System.out.println("This is the second array");
		display(secondarray);
	}
	
	
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[row].length;column++){ 			/* x[row} means that it wil go until the end of the row and no more*/
				System.out.print(x[row][column]+"\t");
			}
		System.out.println();
		} /* the assembler will go to row 0, then go into the second for loop and print out the columns, when done it will go to the next row*/
		
	}

}
