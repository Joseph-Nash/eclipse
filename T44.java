package test;

public class T44 {
	public static void main(String[] args){
		for(T44enum peeps: T44enum.values())
			System.out.printf("%s\t%s\t%s\n", peeps, peeps.getDesc(), peeps.getAge());
		
	}
}
