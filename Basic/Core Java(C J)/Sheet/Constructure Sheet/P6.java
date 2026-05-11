// 6)
// Constructor with One Parameter:

// Create a class Book with an instance variable title and write a constructor that accepts a title and assigns it to the instance variable.


public class P6 
{
 public static void main(String[] args) 
 {
     Book b = new Book("Java" );
 }    
}

class Book 
{
    String title;
    Book(String title)
    {
        this.title=title;
        System.out.println("Book Title : " + title);
    }
}
