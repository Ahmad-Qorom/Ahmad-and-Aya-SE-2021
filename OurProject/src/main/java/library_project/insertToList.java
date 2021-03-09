package library_project;

import java.util.ArrayList;

public class insertToList
{
    public String Title=null;
    public String Author=null;
    public String ISBN=null;
    public String Signature=null;


    public void addBook(String bookTitle,String bookAuthor,String bookISBN,String bookSignature)
    {
    	Title=bookTitle;
    	Author=bookAuthor;
    	ISBN=bookISBN;
    	Signature=bookSignature;
    }
    
}
