package test;

public class T48 {
	public static void main(String[] args){
		T48tuna tunaObject = new T48tuna(2); //calls the object NUMBER and sets it as final to 2
		
		tunaObject.add(); //runs the add method where sum is initialised to 2
		
		for(int j =0; j<20; j++){ //for loop where the times method is run 20 times and printed each time
		tunaObject.times();
		System.out.printf("%s", tunaObject);
	}
} //important part of this tutorial is where the final is used in T48tuna - showing that whatever happens you cannot change the variabel once it is set.
}
