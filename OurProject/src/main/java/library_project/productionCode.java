package library_project;
import java.util.ArrayList;

public class productionCode
{
	private ArrayList<insertToList> library=new ArrayList<insertToList>();
	private insertToList obj;
	private insertToList books;

	
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
	
	/*public void printBook()
	{
		System.out.println("number of books in library = "+library.size());
		obj=library.get(0);
		
		
		
		System.out.println("Book Name     : "+obj.Title);
		System.out.println("Book ISBN     : "+obj.ISBN);
		System.out.println("Book Signature: "+obj.Signature);
	}*/
}
