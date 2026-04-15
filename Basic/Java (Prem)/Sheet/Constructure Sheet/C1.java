// Q.1)
 
// Basic Constructor:

// Create a class Book with instance variables title and author. Use a constructor to initialize these variables.


class C1 
{
    public static void main(String[] args) 
    {
         Book b=new Book("Java", "James Gosling");
    }
}

class Book 
{
    String tital;
    String author;

    Book(String tital, String author)
    {
        this.tital=tital;
        this.author=author;

        System.out.println("Book Title : " + tital);
        System.out.println("Book Name : " + author);
    }
}