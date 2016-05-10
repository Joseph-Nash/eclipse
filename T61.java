package test;

public class T61 {	
	public static void main(String[] args){
		
		T61Animal[] thelist = new T61Animal[2];
		T61Dog d = new T61Dog();
		T61Fish f = new T61Fish();
		
		thelist[0] = d;
		thelist[1] = f;
		
		for(T61Animal x: thelist){
			x.noise();
		}
	}
}
