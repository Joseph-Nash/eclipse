package test;

abstract public class T57food { // this food class has a method that is called by its subclasses - eat.

	//^ you can use this class of food, but cannot create any objects from it
	
	public void eat(){
		System.out.println("Isn't all this food amazing!");
	}
}
/* overriding a method
* must use same arguments as in the super class (can't have int in one)
* its called overloading if you do add int
* same thing - it has to return the same thing - return an int in superclass
* it must return int in subclasses
* why? - its so that there is consistency that the eat method will work with any subclasses
* 
* 
*/