package library_project;
import java.util.ArrayList;
public class ProductionCode2
{
	protected static final ArrayList<InsertToList2> library=new ArrayList<InsertToList2>();
	private InsertToList2 books=null;

	public boolean addBook(String bookTitle,String bookAuthor,String bookISBN,String bookSignature)
	{
		books=new InsertToList2(bookTitle, bookAuthor, bookISBN, bookSignature);
	    library.add(books);
	    
	    return extracted();
	}



	public boolean extracted() {

		return !(books.iSBN==null || library.isEmpty());
	}
	
}
	
	
	
	
	
	
	
	
	
	
	