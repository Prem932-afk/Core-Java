// Q.1)
 
// Basic Constructor:

// Create a class Book with instance variables title and author. Use a constructor to initialize these variables.

class P1 
{
    public static void main(String args[])
    {
        Book b=new Book("Java", "James Gosling");
        b.display();
    }
}

class Book 
{
    private String title;
    private String auther;

    Book(String title, String auther)
    {
         this.title=title;
         this.auther=auther;
    }

    void display()
    {
        System.out.println("Titlte Book : " + title );
        System.out.println("Authore Book : " + auther);
    }
}