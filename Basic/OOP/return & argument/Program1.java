public class Program1 
{
     public static void main(String[] args) 
     {
         A a=new A();
          a.show(9);
          a.show2('A');
          a.show3(1.2f);  
     }    
}
class A
{
      int show(int n)
      {
        System.out.println(n);
        return n;
      }

      char show2(char ch)
      {
        System.out.println(ch);
        return ch;
      }

      float show3(float f)
      {
        System.out.println(f);
        return f;
      }
}
// A :
// 	primtiive data type 