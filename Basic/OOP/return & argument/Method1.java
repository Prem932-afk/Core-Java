
class Method1
{
    public static void main(String[] args) 
    {
        A p=new A();
        System.out.println(p.show(2,3));
        

        
    }
}
class A
{
    int show(int a,int b)
    {   
        int x=a;
        int y=b;
        int c=x+y;
        System.out.println("Add :"+c);
        return c;
    }
    float show(float a, float b)
    {
        float x=a;
        float y=b;
        float c=x+y;
        System.out.println("float add:"+c);
        return c;
    }
      char  show(char a)
    {
      
        return a;
    }
}