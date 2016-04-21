package test;

public class tute43potpie {
	private int month;
	private int day;
	private int year;
	
	public tute43potpie (int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this);
		// when this is used - it is directed to toString
	}
	
	public String toString(){
		return String.format("%d/%d/%d", day, month, year);
	}
}
