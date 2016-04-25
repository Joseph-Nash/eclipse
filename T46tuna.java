package test;

public class T46tuna {

	private String first;
	private String last;
	private static int members = 0;
	
	public T46tuna(String fn, String ln){
		first = fn;
		last = ln;
		members++;
		System.out.printf("%s %s, is a member of the hottie club. Total members = %d\n", first, last, members);
	}
	
	public String getFirst(){
		return first;
	}
	public String getLast(){
		return last;
	}
	public static int getMembers(){
		return members;
	}
}
