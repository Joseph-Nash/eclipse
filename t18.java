package test;

public class t18 {
	public static void main(String[] args){
		int age = 60;
		
		if (age < 50){
			System.out.println("You are pretty young");
		}else{
			System.out.println("you are old!");
			if (age > 75){
				System.out.println("you are REALLY old!");
			}else{
				System.out.println("dont worry you arent that old");
			}
		}
	}
}
