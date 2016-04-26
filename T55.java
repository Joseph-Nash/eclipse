package test;

public class T55 {

public static void main(String[] args){
	
	T55food josie[] = new T55food[2];
	josie[0] = new T55tuna();
	josie[1] = new T55potpie();
	
	for(int x=0;x<2;x++){
		josie[x].eat();
	}
}
}
