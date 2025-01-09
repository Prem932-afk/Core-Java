import javax.sound.sampled.SourceDataLine;

public class Program2 
{
   public static void main(String[] args) 
   {
      E e=new E();
       e.show();
       e.show2(1);
       e.show3();
       e.show4("metho");
   }    
}

interface A
{
   void show();
}

interface B
{
   void show2(int a);
}


interface C 
{
   int show3();
}

interface D
{
   String show4(String name);
}

class E implements A,B,C,D
{
    public void show()
    {
      System.out.println("method1 :no return and no argument ");
    }

    public void show2(int a)
    {
       System.out.println("method2:no return and  argument "+a);
    }

    public int show3()
    {
       int n=10;
       System.out.println("method3: return and no argument ");
       return n;
    }

    public String show4(String name)
    {
        System.out.println("method4 : return and  argument ");
        return name;
    }
}
// multiple inheritance

// interface : 
// 	method1 :no return and no argument 

// interface : 
// 	method2:no return and  argument 

// interface : 
// 	method3: return and no argument 

// interface : 
// 	method4 : return and  argument 

// another class access 
