import java.util.Scanner;
class BasicConstructure {
   public static void main(String[] args) {
     Book myBook=new Book("1991","James Goslin");
     System.out.println("Book Title :"+myBook.getTitle());
     System.out.println("Book Auther Name :"+myBook.getAuther());
   }
}
class Book
{
     private String title;
     private String Auther_name;
     Book(String title , String Auther_name)
     {
           this.title=title;
           this.Auther_name=Auther_name; 
     }

         String getTitle()
         {
            return title;
         }
         String getAuther()
         {
            return Auther_name;
         }
}
