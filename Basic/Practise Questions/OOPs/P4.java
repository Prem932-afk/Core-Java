//Call by refrence
public class P4 
{
   public static void main(String[] args) 
   {
      A i=new A();
        i.show(i);//---Referece
        i.display();
   }    
}

class A
{
     int a, b;

     void show(A obj)
     {
        obj.a=100;
        obj.b=200;
     }

     void display()
     {
        System.out.println("Variable of value : " + a + " and " + b);
     }

    
}
