
class Method2 
{
  public static void main(String[] args) 
  {
      A p=new A();
      System.out.println(p.show()); 
      B p1=new B();
      System.out.println(p1.show());
  }    
}
class A
{
    String show()
    {
        String name="Hello world";
        System.out.println(name);
        return name;
    }
}
class B
{
    B show()
    {
        System.out.println("Hello");
        return this;
    }
}