class BookTheatreSeat 
{
    int total_seats = 10;

    // Make this synchronized so multiple threads can't book at same time
    synchronized void Book(int seat) 
    {
        if (total_seats >= seat) 
        {
            System.out.println(seat + " Seat(s) Booked Successfully by " + Thread.currentThread().getName());
            total_seats = total_seats - seat;
            System.out.println("Seats left: " + total_seats);
        } 
        else 
        {
            System.out.println("Seats not available for " + Thread.currentThread().getName());
            System.out.println("Seats available: " + total_seats);
        }
    }
}

class Book extends Thread 
{
    static BookTheatreSeat b;
    int seat;

    public void run() 
    {
        b.Book(seat);
    }

    public static void main(String[] args) 
    {
        b = new BookTheatreSeat();  // ✅ Initialize

        Book Deepak = new Book();
        Deepak.seat = 7;
        Deepak.setName("Deepak");
        Deepak.start();

        Book Raj = new Book();
        Raj.seat = 5;
        Raj.setName("Raj");
        Raj.start();
    }
}
