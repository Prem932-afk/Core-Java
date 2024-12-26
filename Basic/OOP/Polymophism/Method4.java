public class Method4 {
   public static void main(String[] args) {
     A a=new A();
     System.out.println("Add (int): " + a.add(10, 5));              
     System.out.println("Add (long): " + a.add(100L, 200L));      
     System.out.println("Add (float): " + a.add(10.5f, 5.5f));     
     System.out.println("Add (double): " + a.add(10.5, 5.5));      
     System.out.println("Add (byte): " + a.add((byte)10, (byte)5));
     System.out.println("Add (short): " + a.add((short)10, (short)5)); 
     System.out.println("Add (char): " + a.add('A', 'B'));          
     System.out.println("Add (boolean): " + a.add(true, false));   
 }
   } 


class A
{
    int add(int a, int b)
    {
        return a+b;
    }

    long add(long a, long b)
    {
         return a+b;
    }
    float add(float a, float b)
    {
        return a+b;
    }
    byte add(byte a,byte b)
    {
        return (byte) (a+b);
    }
    short add(short a, short b)
    {
        return (short) (a+b);
    }
    double add(double a, double b)
    {
        return a+b;
    }
    int add(char a, char b)
    {
        return a+b;
    }
    int add(boolean a, boolean b)
    {
        return (a ? 1 : 0) + (b ? 1 : 0);
    }
}