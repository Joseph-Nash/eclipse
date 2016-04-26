package test;

public class T57 {
	public static void main(String[] args){
		
		T57fatty josie = new T57fatty(); //new object to refer to the fatty class
		T57food fo = new T57food(); //new object that points toward the T56food class that is used by the fatty class
		T57food po = new T57potpie();// new object that is called for info and uses food class for eat method. (in this case it is overriden)
		T57food tu = new T57tuna(); // new object that is called for info and uses food class for eat method
		
		josie.digest(tu); // josie.digest calls T56fatty class and digest method --> T56food eat method --> from the T56tuna class
		josie.digest(po); // josie.digest calls T56fatty class and digest method --> T56food eat method --> from the T56potpie class
		josie.digest(fo); // josie.digest calls T56fatty class and digest method --> T56food eat method
//		josie.digest(null);

	}
}
