public class Program2 
{
  public static void main(String[] args) 
  {
     Document d=new Document();
     d.print();
  }    
}
interface Printable
{
     void print();
}
class Document implements Printable
{
    public void print()
   {
    System.out.println("Printing the document with custom behavior.");
   }
}
//Create an interface Printable with a default method print(). Implement this interface in a class and override the print() method to customize its behavior.
