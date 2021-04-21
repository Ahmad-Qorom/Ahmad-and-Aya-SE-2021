package library_project;
import java.util.logging.Logger;

public class Searchclass2
{
	
	 private String flagetitel="not found";
	 private static final String FLAGETITEL2="found";
	 private Logger log= Logger.getLogger(Searchclass2.class.getName());
     private String inLog;
		public String find(String sub,String subj) 
		{
	     			
			if(subj.equalsIgnoreCase("titel")) 
			{
				
				for(InsertToList2 b:ProductionCode2.library)
				{
			    	extracted(sub, b);
				}
					
				return flagetitel;
			}
			else if(subj.equalsIgnoreCase("author"))
			{
				for(InsertToList2 b:ProductionCode2.library)
				{
					
				   ifAuthor(sub, b);
				}
				return flagetitel;
			}
			
			else if(subj.equalsIgnoreCase("ISBN")) 
			{
				if(sub.length()!=10) 
					return flagetitel;
				
				loppForISBN(sub);
				return flagetitel;
			}
			
			else if(subj.equalsIgnoreCase("Signature")) 
			{
				
				loopForSignature(sub);	
				return flagetitel;
			}
			
				else if(subj.equalsIgnoreCase("subject")) 
					return extracted( sub); 
				else if(subj.equalsIgnoreCase("substring"))    //substring
					return extracted( sub);
	
			
			
			return flagetitel;
		
			
			
			
		}


		public void loopForSignature(String sub) {
			for(InsertToList2 b:ProductionCode2.library)	
			  if(	b.signature.contains(sub))
			  {
				
				flagetitel=FLAGETITEL2;
				inLog=b.author+" "+b.titel+" "+b.signature+" "+b.iSBN+"\n";
				log.info(inLog);


			  }
		}


		public void loppForISBN(String sub) {
			for(InsertToList2 b:ProductionCode2.library)
			   if(	b.iSBN.contains(sub)) 
			   {
				  flagetitel=FLAGETITEL2;
				  inLog=b.author+" "+b.titel+" "+b.signature+" "+b.iSBN;
				  log.info(inLog);
				  log.info("\n");
			   }
		}


		public void ifAuthor(String sub, InsertToList2 b) {
			if(	b.author.contains(sub)) 
			  {
				
				flagetitel=FLAGETITEL2;
				inLog=b.author+" "+b.titel+" "+b.signature+" "+b.iSBN;
				log.info(inLog);

				log.info("\n");
			  }
		}


		public String extracted( String sub) 
		{
			   for(InsertToList2 b:ProductionCode2.library)
		       {
		    	 extracted(sub, b);
			   }
			   return flagetitel;
			 
		}


		public void extracted(String sub, InsertToList2 b)
		{
			if(	b.titel.contains(sub))
			{
				
				flagetitel=FLAGETITEL2;
				inLog=b.author+" "+b.titel+" "+b.signature+" "+b.iSBN;
				log.info(inLog);

				log.info("\n");
			}
		}


	

}
