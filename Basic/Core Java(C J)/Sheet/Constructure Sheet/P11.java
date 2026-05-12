// 11)
// Constructor and Display Method:

// Create a Book class with title, author, and price as instance variables. Use a constructor to initialize these, and then write a method displayDetails() to print them.


class P11 
{
    public static void main(String args[])
    {   
        // Creating Book object
        Boo b1 = new Boo("Java Programming", "James Gosling", 500);

        // Calling display method
        b1.displayDetails();
    }
}

class Boo
{
    String title;
    String author;
    int price;

   
    Boo(String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    void displayDetails()
    {
        System.out.println("Book Title  : " + title);
        System.out.println("Book Author : " + author);
        System.out.println("Book Price  : " + price);
    }
}