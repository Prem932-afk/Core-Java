
interface A
{
    public abstract void show();
}

class main implements A 
{
    public void show()
    {
         System.out.println("Show method"); 
    }

    public static void main(String[] args) 
    {
         A obj=new main();
          obj.show();    
    }
}