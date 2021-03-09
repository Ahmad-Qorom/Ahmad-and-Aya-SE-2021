package library_project;

import java.util.ArrayList;

public class searchclass {

	
		public static insertToList b1=new insertToList("Software Engineering","Ian Sommerville","somm2011","2011111111");
		public static insertToList b2=new insertToList("Software","Ian","somm2011","2011222222");
		 ArrayList<insertToList> library =new ArrayList<insertToList>();
	
	
			private String flagetitel="not found";
			
			public String find(String sub,String subj) {
				library.add(b1);
				library.add(b2);
				if(subj=="titel") {
				
				for(insertToList b:library)
				{
					
				if(	b.Titel.contains(sub)) {
					
					flagetitel="found";
					System.out.print(b.Author+" "+b.Titel+" "+b.Signature+" "+b.ISBN);
					
					System.out.print("\n");
					}
					}
					
				
					
			
				return flagetitel;
				}
				
				
				else if(subj=="author") {
					
					for(insertToList b:library)
					{
						
					if(	b.Author.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.Author+" "+b.Titel+" "+b.Signature+" "+b.ISBN);
						
						System.out.print("\n");
						}
						}
						
					
						
				
					return flagetitel;
					}
				
				else if(subj=="ISBN") {
					if(sub.length()!=10) {
						return flagetitel;
					}
					for(insertToList b:library)
					{
						
					if(	b.ISBN.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.Author+" "+b.Titel+" "+b.Signature+" "+b.ISBN);
						
						System.out.print("\n");
						}
						}
						
					
						
				
					return flagetitel;
					}
				
				else if(subj=="signature") {
					
					for(insertToList b:library)
					{
						
					if(	b.Signature.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.Author+" "+b.Titel+" "+b.Signature+" "+b.ISBN);
						
						System.out.print("\n");
						}
						}
						
					
						
				
					return flagetitel;
					}
				
					else if(subj=="subject") {
					
					for(insertToList b:library)
					{
						
					if(	b.Titel.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.Author+" "+b.Titel+" "+b.Signature+" "+b.ISBN);
						
						System.out.print("\n");
						}
						}
						
					
						
				
					return flagetitel;
					}
					else if(subj=="substring") {
				
						for(insertToList b:library)
					{
						
					if(	b.Titel.contains(sub)) {
						
						flagetitel="found";
						System.out.print(b.Author+" "+b.Titel+" "+b.Signature+" "+b.ISBN);
						
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
