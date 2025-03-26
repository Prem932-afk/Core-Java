// 5)
// Write a Java program where a subclass inherits from a superclass and attempts to access private members (and observe the result).

public class P5 
{
    public static void main(String[] args) 
    {
         subclass s = new subclass();
         s.showPrivateMember();
    } 
}
class Superclass
{
    private String privatmember="I am Private";
    String privatemember()
    {
        return privatmember;
    }
}
class subclass extends Superclass
{
     void showPrivateMember()
     {
        System.out.println(privatemember());
     }
}
