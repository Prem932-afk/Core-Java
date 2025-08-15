 
//  Q.1)
 
//  Basic Constructor:

//  Create a class Book with instance variables title and author. Use a constructor to initialize these variables.
 
 class P1
{
    public static void main(String[] args) 
    {
       Book a=new Book("Java","james Gosling");  
    }
}

class Book
{
       String title;
       String Author;

        Book( String title, String Author)
       {
           this.title=title;
           this.Author=Author;
           System.out.println("Title of Book :"+title);
           System.out.println("Author of Book :"+Author);
       }
}
