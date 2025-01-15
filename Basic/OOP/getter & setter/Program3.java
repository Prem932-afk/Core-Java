public class Program3
{
    public static void main(String[] args) 
    {
        Book b=new Book(799);
        System.out.println("Book price :"+b.getPrice());
    }
}

class Book
{
    private double price;
    Book(double price)
    {
       this.price=price;
    }

    double getPrice()
    {
        return price;
    }
}
//Using Getter and Setter
//Write a class Book with a private field price (double). Use a setter method to set the price and a getter method to retrieve the price.
