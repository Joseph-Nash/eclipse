package test;

public class T87 {
	public static void main(String[] args){
		
		String appleCheck = "Apples Baybee";
		String nameCheck = "Josie Joe";
		String nameCap = "JOSIE JOE";
		
		if(appleCheck.equals("Apples Baybee")){
			System.out.println("you the best");
		}
		
		if (nameCheck.equalsIgnoreCase(nameCap)){
			System.out.println("caps mean nothing");
		}
	}

}
