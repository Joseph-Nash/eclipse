package test;

public class T31 {
	public static void main(String[] args){
		int josie[] ={1,2,3,4,5}; /* made an array named josie using an array initialiser*/
		int total=0; /* variable named total which will be constantly added to*/
		
		for(int x: josie){/* enhanced for statement. takes the type i.e int, then the identifier - variable in which you want to store the array values in*/
			total+=x; /*adds the loop*/
		}
		
		System.out.println(total);
		
	}
}
