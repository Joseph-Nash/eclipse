package test;

public class t17c {

	private String girlName;

	public t17c(String name){
		girlName=name;
	}
	
/*	public void setName (String name){
		girlName = name;
	}
*/	
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("your first girlfriend was %s\n",  getName());
	}
}
