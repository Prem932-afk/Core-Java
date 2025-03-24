// 19)
// Constructor in Main Method:

// Create a class Book with title and author as instance variables. In the main method, create an object using the constructor and display the title and author.

public class P19 
{
  public static void main(String[] args) 
  {
    Book b = new Book();
    
  }    
}
class Book
{
    String title;
    String author;
    Book()
    {
        this.title="Java ";
        this.author="Jame Gosling";
        System.out.println("Book Title : "+title);
        System.out.println("Book Author : "+ author);
    }
}
