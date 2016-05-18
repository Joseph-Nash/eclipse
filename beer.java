package test;

public class beer {
		
		private static int numOfBottles = 99;
		
		public static void main (String[] args) { 
			
			beerSong();
		
		}
		
		public static void beerSong() { 
			
			for(int i = 99;i > -1 ;i--){
				if(i == 0){
					System.out.println("No more bottles of beer on the wall :(");
				} else if (i == 1){
					System.out.println(i + " bottle of beer on the wall");
					System.out.println(i + " bottle of beer");
					System.out.println("You take one down\nand pass it around\n");
				} else {
				System.out.println(i + " bottles of beer on the wall");
				System.out.println(i + " bottles of beer");
				System.out.println("You take one down\nand pass it around\n");
				}
			}
			
		}
		
	}

