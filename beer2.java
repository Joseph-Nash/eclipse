package test;

public class beer2 {
	
	private static int numOfBottles = 99;
	
	public static void main(String[] args) {
		
		beerSong();
		
	}
	
	public static void beerSong() {
		
		for (int i = 99; i > -1; i--) {
			if (i == 0) {
				System.out.println("No more bottles of beer on the wall :(");
				System.out.println("  _.._..,_,_");
				System.out.println(" (          )");
				System.out.println("  ]~,'-.-~~[");
				System.out.println(".=])' (;  ([");
				System.out.println("| ]:: '    [");
				System.out.println("'=]): .)  ([");
				System.out.println("  |:: '    |");
				System.out.println("   ~~----~~");
				
			} else if (i == 1) {
				System.out.println(i + " bottle of beer on the wall");
				System.out.println(i + " bottle of beer");
				System.out.println("You take one down\nand pass it around\n");
			} else if (i > 2) {
				System.out.println(i + " bottles of beer on the wall");
				System.out.println(i + " bottles of beer");
				System.out.println("You take one down\nand pass it around");
				System.out.println(i - 1 + " bottles of beer on the wall\n");
			} else if (i == 2) {
				System.out.println(i + " bottles of beer on the wall");
				System.out.println(i + " bottles of beer");
				System.out.println("You take one down\nand pass it around");
				System.out.println(i - 1 + " bottle of beer on the wall\n");
			}
		}
	}
}