public class ConstructorSheet6 
{
   public static void main(String[] args) 
   {
     new Book("Core Java");
   }    
}
class Book
{
     String title;
     Book(String title)
     {
        this.title=title;
        System.out.println("The Bokk title is :"+title);
     }

}
  
// Constructor with One Parameter:

// Create a class Book with an instance variable title and write a constructor that accepts a title and assigns it to the instance variable.