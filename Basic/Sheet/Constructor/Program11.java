class Program11 
{
    public static void main(String[] args) 
    {
        Book b=new Book("Java", "jame", 999); 
        b.displayDetails();
    }    
}
class Book 
{
    String title;
    String author;
    int price;
    Book(String title, String author, int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayDetails()
    {
        System.out.println("Book title :"+title);
        System.out.println("Bookd autho :"+author);
        System.out.println("Book price :"+price);
    }
}
//Constructor and Display Method:

// Create a Book class with title, author, and price as instance variables. Use a constructor to initialize these, and then write a method displayDetails() to print them.

