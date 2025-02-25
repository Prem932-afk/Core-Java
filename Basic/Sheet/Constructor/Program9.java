public class Program9 
{
 public static void main(String[] args) 
 {
    new Book("Java");
 }    
}
class Book 
{
    String title;
    Book(String title)
    {
        this.title=title;
        System.out.println("Book title :"+title);
    }
}
//Constructor with String Parameter:

// Define a class Book with a constructor that accepts a String representing the book’s title and assigns it to the title instance variable.
