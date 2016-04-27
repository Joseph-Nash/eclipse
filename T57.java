package test;

public class T57 {
	public static void main(String[] args){
		
		T57fatty josie = new T57fatty(); //new object to refer to the fatty class
//		T57food fo = new T57food(); //new object that points toward the T57food class that is used by the fatty class
		T57food po = new T57potpie();// new object that is called for info and uses food class for eat method. (in this case it is overriden)
		T57food tu = new T57tuna(); // new object that is called for info and uses food class for eat method
		
		josie.digest(tu); // josie.digest calls T57fatty class and digest method --> T57food eat method --> from the T57tuna class
		josie.digest(po); // josie.digest calls T57fatty class and digest method --> T57food eat method --> from the T57potpie class
//		josie.digest(fo); // josie.digest calls T57fatty class and digest method --> T57food eat method
//		josie.digest(null);

	}
}


/*T58 added in
 *
 *abstract for polymorphism and inheritance
 *concrete is for any other class that can be specific enough to use objects
 *
 *food too broad
 *
 *food fo = new food(); is too broad
 *food reference:
 *food fo = new tuna(); - no restrictions on tuna
 *
 *methods can be abstract as well
 *
 *method that HAS to be overwritten
 *
 *methods eat in tuna and potpie have to be there to work
 *
 *abstract method creation:
 *head and semicolon
 *
 *public abstract void eat();
 *
 *if an abstract method is present, then the class MUST be abstract as well. but
 *the abstract class does not dictate that the methods must be abstract
 *
 *if there is an abstract method: MUST be used in its in inherited classes.
 *
 *so if food is abstract, then potpie or tuna must implement or override.
 *
 *for consistency and polymorphism
 */