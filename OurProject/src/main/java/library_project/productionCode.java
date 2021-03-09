package library_project;
import java.util.*;

public class productionCode
{
	private ArrayList<insertToList> library=new ArrayList<insertToList>();
	private insertToList obj;
	private insertToList books=new insertToList();
	//private insertToList searching=new insertToList();

	
	public productionCode(insertToList obj)
	{
		this.obj = obj;
	}
	
	
	public boolean iscorrect(boolean password)
    {
   	 if(password)
   		 return true;
   	 
   	 else 
   		 return false;
    }

	public String logOut()
	{
		String logOut="Exit";
		return logOut;
	}
	
	
	public boolean addBook(String bookTitle,String bookAuthor,String bookISBN,String bookSignature,boolean done)
	{
		books=new insertToList();
	    books.addBook(bookTitle, bookAuthor, bookISBN, bookSignature);
	    library.add(books);
	    
	    if(books.ISBN==null && library.size()==0)
	        return false;
	    else 
	    	return true;
	}
	
	public insertToList[] searchAuthor(String author)
	{
		String [] tokens;
		insertToList[] authors = {};
		int count=0,j=0;
		//System.out.println("Welcome");
	    for(int i=0;i<library.size();i++)
	    {
	    	books=library.get(i);
	    	if(author.equalsIgnoreCase(books.Author))
	    	  {
	    		 authors[count]=books;
	    		 count++;
	    	  }
	    	
	    	else
	    	{
	    		tokens=books.Author.split(" ");
	    	
	        /*	for(String subName : tokens)
	        		if(author.equalsIgnoreCase(subName))
	    	     	{
	    		  	   authors[j]=books;
	    			   j++;
	    			   break;
	    		    }*/
	        	for(int z=0;z<=tokens.length;z++)
	        	{
	        		if(author.equalsIgnoreCase(tokens[z]))
	        		{
	        		    authors[j]=books;
	        		    j++;
	        		    break;
	        		}
	        	}
	        		
	        	
	        		
	         }
			
		}
	    for(int z=0;z<=authors.length;z++)
	    {
	    	System.out.println(authors[z].Author+" ");
	    }
	    return authors;
    }
	
	
}
	
	
	
	
	
	
	
	
	
	
	