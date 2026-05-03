// Q.1)
 
// Basic Constructor:

// Create a class Book with instance variables title and author. Use a constructor to initialize these variables.


class C1
{
    public static void main(String args[])
    {
         Book b=new Book("Java", "Games Gosling");
         b.display();
    }
}

class Book
{
    String title;
    String author;

    Book(String title, String author)
    {
        this.title=title;
        this.author=author;
    }

    void display()
    {
         System.out.println("Title Name : " + title);
         System.out.println("Author Name : " + author);
    }
}