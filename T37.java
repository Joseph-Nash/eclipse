package test;

public class T37 {
	public static void main(String[] args){
		timeclass timeclassObject = new timeclass();
		System.out.println(timeclassObject.toMilitary());
		System.out.println(timeclassObject.toString());
		
	timeclassObject.setTime(13, 5, 26);
	System.out.println(timeclassObject.toMilitary());
	System.out.println(timeclassObject.toString());
	}
}
