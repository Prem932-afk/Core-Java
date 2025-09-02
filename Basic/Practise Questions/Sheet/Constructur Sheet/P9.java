public class P9 
{
  public static void main(String[] args) 
  {
       new Book("JAVA");  
  }    
}
class Book
{
     String title;
     Book(String title)
     {
        this.title=title;
        System.out.println("The Books Title :" +title);
     }
}


// 9)
// Constructor with String Parameter:

// Define a class Book with a constructor that accepts a String representing the book’s title and assigns it to the title instance variable.
