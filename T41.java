package test;

public class T41 {
	public static void main(String[] args){
	
		multiCon multiConObject = new multiCon();
		multiCon multiConObject2 = new multiCon(5);
		multiCon multiConObject3 = new multiCon(5,13);
		multiCon multiConObject4 = new multiCon(5,13,43);
		
		System.out.printf("%s\n", multiConObject.toMilitary());
		System.out.printf("%s\n", multiConObject2.toMilitary());
		System.out.printf("%s\n", multiConObject3.toMilitary());
		System.out.printf("%s\n", multiConObject4.toMilitary());
	}
}

/*  object2 = has two parameters - goes to multiCon object and checks which matches
* uses whatever matches the constructor arguments.
* then it fills in the rest with 0
* then goes to set time method - checks the rules on value boundaries
* call military method - for formatting and printing the string

*/