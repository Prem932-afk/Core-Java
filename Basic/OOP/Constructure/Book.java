
public class Book
{
 
    String title;
    String author;

     Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    
    public static void main(String[] args) 
    {
       
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");

       
        System.out.println("Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
    }
}

//Constructor in Main Method:

//Create a class Book with title and author as instance variables. In the main method, create an object using the constructor and display the title and author.
