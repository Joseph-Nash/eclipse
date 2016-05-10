package test;

public class T59DogList {
	private T59Dog[] theList = new T59Dog[5];
	private int i=0;
	
	public void add(T59Dog d){
		if (i<theList.length);
		theList[i] = d;
		System.out.println("Dog added at index "+i);
		i++;
	}

}
