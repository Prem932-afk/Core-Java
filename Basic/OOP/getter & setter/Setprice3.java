public class Setprice3 {
    public static void main(String[] args) {
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