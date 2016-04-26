package test;

public class T56 {
	public static void main(String[] args){
		
		T56fatty josie = new T56fatty(); //new object to refer to the fatty class
		T56food fo = new T56food(); //new object that points toward the T56food class that is used by the fatty class
		T56food po = new T56potpie();// new object that is called for info and uses food class for eat method. (in this case it is overriden)
		T56food tu = new T56tuna(); // new object that is called for info and uses food class for eat method
		
		josie.digest(tu); // josie.digest calls T56fatty class and digest method --> T56food eat method --> from the T56tuna class
		josie.digest(po); // josie.digest calls T56fatty class and digest method --> T56food eat method --> from the T56potpie class
		josie.digest(fo); // josie.digest calls T56fatty class and digest method --> T56food eat method
//		josie.digest(null);

	}
}
