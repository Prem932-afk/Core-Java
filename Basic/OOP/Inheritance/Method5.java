 class Method5 {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.show2(5, 6);
       
    }
}
class A
{
    private int a;
    private int b;
    
    void show()
    {
        System.out.println("Show");
    }
    
    int getAdd()
    {
        return a+b;
    }
    
    
}
class B extends A
{
    private int a;
    private int b;
    void show2(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Sub : "+(a-b));
       
    }
    
    int getsub()
    {
        return a-b;
    }
    
}
// A 
// 	instance variable :private 
// 	getter and setter method 

// B 
// 	instance variable :private 
// 	getter and setter method

// access child through
