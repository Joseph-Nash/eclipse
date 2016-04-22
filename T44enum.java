package test;

public enum T44enum { //this is an enumeration object, where the data is inputted below.
	joseph("Dude", "23"),
	Laura("controlling", "21"),
	Mahori("spoilt", "25"),
	Vicky("v.good", "19");
	
	private final String desc;
	private final String age;
	
	T44enum(String description, String theirAge){
		desc = description;
		age = theirAge;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getAge(){
		return age;
	}
	
}
