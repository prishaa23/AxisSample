package BookManipulationExercise;

import BookManipulationExercise.Book1;

import java.util.*;
public class BookManipulation{
    private ArrayList<Book1> bookList=new ArrayList<Book1>();

    public ArrayList<Book1> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book1> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book1 bobj){
        bookList.add(bobj);
    }
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    public ArrayList<Book1> viewAllBooks(){
        return bookList;
    }
    public ArrayList<Book1> viewBooksByAuthor(String author){
        ArrayList<Book1> result=new ArrayList<Book1>();
        Iterator iter=bookList.iterator();
        while(iter.hasNext())
        {
            Book1 b=(Book1)iter.next();
            if(b.getAuthor().equalsIgnoreCase(author))
                result.add(b);
        }
        return result;
    }
    public int countnoofbook(String bname){
        int count=0;
        Iterator iter=bookList.iterator();
        while(iter.hasNext())
        {
            Book1 b=(Book1)iter.next();
            if(b.getBookName().equalsIgnoreCase(bname))
                count++;
        }
        return count;
    }
}