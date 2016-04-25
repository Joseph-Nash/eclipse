package test;

import java.util.EnumSet;

public class T44 {
	public static void main(String[] args){
		for(T44enum peeps: T44enum.values())
			System.out.printf("%s\t%s\t%s\n", peeps, peeps.getDesc(), peeps.getAge());
		
// T45 addition of Enum.set to print out a range of values depending on what is given
		
	System.out.println("\nAnd now for a range of varaibles, drum roll please...\n");
	
	for (T44enum peeps:EnumSet.range(T44enum.Ava, T44enum.Vicky))
	System.out.printf("%s\t%s\t%s\n", peeps, peeps.getDesc(), peeps.getAge());
		
	}
}
