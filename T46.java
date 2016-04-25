package test;

public class T46 {
	public static void main(String[] args){
		
		T46tuna member1 = new T46tuna("Hot","Girl");
		T46tuna member2 = new T46tuna("Megan","Fox");
		T46tuna member3 = new T46tuna("Emma","Stone");

//T47 static continued - looking at the use of static to prove that the variable is separate from first and last name.
		
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(T46tuna.getMembers());
		
		//for static variables you can use the name of the class and then .getMembers. you can also do it as memberx.getMembers , but there is no need
		
	}
}
