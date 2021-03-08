package libraryproject;

import java.util.ArrayList;

public class searchclass {

	int i=0;
		public static book b1=new book("Software Engineering","Ian Sommerville","somm2011","2011111111");
		public static book b2=new book("Software","Ian","somm2011","2011222222");
		 ArrayList<book> A =new ArrayList<book>();
	
	
			private String flagetitel="not found";
			
			public String find(String sub,String subj) {
				A.add(b1);
				A.add(b2);
				if(subj=="titel") {
				
				for(book b:A)
				{
					
				if(	b.titel.contains(sub)) {
					
					flagetitel="found";
					System.out.print(b.author+" "+b.titel+" "+b.signature+" "+b.ISBN);
					
					System.out.print("\n");
					}
					}
					
				
					
			
				return flagetitel;
				}
				
				
				else if(subj=="author") {
					
					for(book b:A)
					{
						
					if(	b.author.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.author+" "+b.titel+" "+b.signature+" "+b.ISBN);
						
						System.out.print("\n");
						}
						}
						
					
						
				
					return flagetitel;
					}
				
				else if(subj=="ISBN") {
					if(sub.length()!=10) {
						return flagetitel;
					}
					for(book b:A)
					{
						
					if(	b.ISBN.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.author+" "+b.titel+" "+b.signature+" "+b.ISBN);
						
						System.out.print("\n");
						}
						}
						
					
						
				
					return flagetitel;
					}
				
				else if(subj=="signature") {
					
					for(book b:A)
					{
						
					if(	b.signature.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.author+" "+b.titel+" "+b.signature+" "+b.ISBN);
						
						System.out.print("\n");
						}
						}
						
					
						
				
					return flagetitel;
					}
				
		else if(subj=="subject") {
					
					for(book b:A)
					{
						
					if(	b.titel.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.author+" "+b.titel+" "+b.signature+" "+b.ISBN);
						
						System.out.print("\n");
						}
						}
						
					
						
				
					return flagetitel;
					}
		else if(subj=="substring") {
			
			for(book b:A)
			{
				
			if(	b.titel.contains(sub)) {
				
				flagetitel="found";
				System.out.print(b.author+" "+b.titel+" "+b.signature+" "+b.ISBN);
				
				System.out.print("\n");
				}
				}
				
			
				
		
			return flagetitel;
			}
			
				
				
				return flagetitel;
			
				
				
				
			}
			public static void main() {
				
				
			}

}
