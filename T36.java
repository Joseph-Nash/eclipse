package test;

public class T36 {
	public static void main(String[] args){
		timeclass timeclassObject = new timeclass();
		System.out.println(timeclassObject.toMilitary());
		
	timeclassObject.setTime(13, 5, 26);
	System.out.println(timeclassObject.toMilitary());
		
	}
	
}
