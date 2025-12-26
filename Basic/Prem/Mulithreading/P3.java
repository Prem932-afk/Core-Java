import java.util.function.BiPredicate;

class BookTheaterSeat
{
   int totalseats=10;

   void bookseat(int seat)
   {
      if(totalseats>=seat)
      {
         totalseats=totalseats-seat;
        System.out.println("Seat book Sucessfully");
          System.out.println("Left Seat : "+ totalseats);
      }
      else
      {
         System.out.println("Seat Can't book succefuly");
      }

   }
}

class P3 extends Thread
{
  static BookTheaterSeat b;
  int seat;
  public void run()
  {
       b.bookseat(seat);
  }

  public static void main(String[] args) 
  {
    b=new BookTheaterSeat();

    P3 Deepak=new P3();
     Deepak.seat=7;
     Deepak.start();

    P3 Rames=new P3();
      Rames.seat=5;
      Rames.start();
  }
}
