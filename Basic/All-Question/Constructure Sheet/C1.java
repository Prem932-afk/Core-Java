// Q.1)
 
// Basic Constructor:

// Create a class Book with instance variables title and author. Use a constructor to initialize these variables.

class C1
{
   public static void main(String args[])
   {
         new Book("jAVA", "James Gosling");
   } 
}

class Book
{
    String title;
    String author;
    Book(String title , String author)
    {
      this.title=title;
      this.author=author;
      System.out.println("Book title : "+title);
      System.out.println("Book author :"+author);
    } 
    
}