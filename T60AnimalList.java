package test;

public class T60AnimalList {

	private T60Animal[] theList = new T60Animal[5];
	private int i = 0;
	
	public void add(T60Animal a){
		if(i<theList.length){
			theList[i]=a;
			System.out.println("Animal added at index "+i);
			i++;
		}
	}
}
