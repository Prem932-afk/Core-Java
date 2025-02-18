class program1
{
    public static void main(String[] args) 
    {
        Program1 b=new Program1("Java", "James Gosling");
    }
}
class Program1 
{
       String title;
       String author;
       Program1(String title, String author)
       {
         this.title=title;
         this.author=author;

         System.out.println("Book title : " +title);
         System.out.println("Boot author :"+author);
       }

}
//Create a class Book with instance variables title and author. Use a constructor to initialize these variables.