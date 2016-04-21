package test;

public class tute43tuna {
	private String name;
	private tute43potpie birthday;
	
	public tute43tuna(String theName,tute43potpie theDate){
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}//second %s isn't actually a string but to an object, within the object there is a toString method that converted it to a String (potpie)

}
