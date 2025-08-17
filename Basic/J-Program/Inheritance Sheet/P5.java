
//Q.5) Write a Java program where a subclass inherits from a superclass and attempts to access private members (and observe the result).

public class P5 
{
    public static void main(String[] args) 
    {
         subclass s = new subclass();
         s.setPrivatememeber("Five");
         s.showPrivateMember();
    } 
}
class Superclass
{
    private String privatmember;
    void setPrivatememeber(String privatmember)
    {
           this.privatmember=privatmember;
    }

    String getPrivatememeber()
    {
         return privatmember;
    }
    void display()
    {
         System.out.println(privatmember);
    }
}
class subclass extends Superclass
{
     void showPrivateMember()
     {
        display();
     }
}
