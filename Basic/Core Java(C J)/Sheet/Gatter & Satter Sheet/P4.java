// 3)
// Using Getter and Setter
// Write a class Book with a private field price (double). Use a setter method to set the price and a getter method to retrieve the price.
// Using Getter and Setter

class P3
{
    public static void main(String[] args)
    {
        // Creating object
        Book b1 = new Book();

        // Setting price using setter
        b1.setPrice(499.99);

        // Getting price using getter
        System.out.println("Book Price : " + b1.getPrice());
    }
}

class Book
{
    // Private field
    private double price;

    // Setter Method
    void setPrice(double price)
    {
        this.price = price;
    }

    // Getter Method
    double getPrice()
    {
        return price;
    }
}