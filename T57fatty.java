package test;

public class T57fatty {

//	tuna to = new tuna();
//	food fo = new tuna(); - works because its tuna is a food
// 	food fo = new food(); - problem - tuna and potpie - colours and shapes - they have them
//	food is too general for this
//	if they are too general you can make them abstract - too general to have a colour or a shape
//	still need it for polymorphism and inheritance ^ - see T57food
	
	public void digest(T57food x){ //this method takes the class T57food as an argument, with x as a parameter
		x.eat(); //calls the method which is present in the subclass food and therefore potpie and tuna
	}
	
}

/*
*
*
*
*
*/