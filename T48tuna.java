package test;

public class T48tuna {
	public int sum;
	private final int NUMBER;
	
	public T48tuna(int x){
		NUMBER = x;
	}
	public void add(){
		sum+=NUMBER;
	}
	public void times(){
		sum*=NUMBER;
	}
	public String toString(){
		return String.format("The sum = %d\n", sum);
	}
}
