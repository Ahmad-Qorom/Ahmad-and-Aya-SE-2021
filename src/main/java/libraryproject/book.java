package libraryproject;

import java.util.ArrayList;

public class book {
	String titel= null;
	String author=null;
	String signature=null;
	String ISBN=null;
	
	public static book b1=new book("Software Engineering","Ian Sommerville","somm2011","2011");
	public static book b2=new book("Software","Ian","somm2011","2011");
	public ArrayList<book> A =new ArrayList<book>();
	
	public book(String titel, String author, String signature,String ISBN) {
     this.titel=titel;
     this.author=author;
     this.signature=signature;
     this.ISBN=ISBN;
		
	}
	public void main() {
		A.add(b1);
		A.add(b2);
	}
}
