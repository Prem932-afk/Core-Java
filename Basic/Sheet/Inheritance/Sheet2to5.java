public class Sheet2to5 
{
    public static void main(String[] args) 
    {
         subclass s=new subclass();
          s.display();
          s.setNumber(4);
          System.out.println(s.getA());
    }
}
class superclass
{
    private int number;
     void setNumber(int number)
     {
          this.number=number;
     }
     int getA()
     {
        return number;
     }
}
class subclass extends superclass
{
   void  display()
   {
    System.out.println("display method");
   }
}
//Write a Java program where a subclass inherits from a superclass and attempts to access private members (and observe the result).
