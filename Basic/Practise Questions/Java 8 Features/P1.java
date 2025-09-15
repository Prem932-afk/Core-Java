interface A
{
    public abstract void show();
}

class P1
{
    public static void main(String[] args) 
    {
        A obj=()->System.out.println("show method");
        obj.show();
    }
}
