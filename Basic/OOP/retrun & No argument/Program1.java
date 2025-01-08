public class Program1 
{
   public static void main(String[] args) 
   {
          A a=new A();
           a.show();
           a.show2();
           a.show3();
   }    
}
class A
{
       int show()
       {
         int n=3;
         System.out.println("int : "+n);
         return n;
       }

       char show2()
       {
          char ch='A';
          System.out.println("Char :"+ ch);
          return ch;
       }

       float show3()
       {
          float f= 1.2f;
          System.out.println("Float : "+f);
          return f;
       }

}

// A :
// 	primtiive data type

