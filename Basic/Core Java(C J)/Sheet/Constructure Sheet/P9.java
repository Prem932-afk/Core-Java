
// 9)
// Constructor with String Parameter:

// Define a class Book with a constructor that accepts a String representing the book’s title and assigns it to the title instance variable.

class P9
{
    public static void main(String[] args) 
    {
           Book b = new Book("jAVA");
           
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