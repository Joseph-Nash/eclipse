package test;

public class T81 {

	public static void main(String[] args){
		
		T81readfile r = new T81readfile();
		r.openFile();
		r.readData();
		r.closeFile();
	}
}
