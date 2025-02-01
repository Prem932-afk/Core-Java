
class A5
{
    final void show()
    {
        System.out.println("Ok");
    }
}
class B5 extends A5
{
    void show2()
    {
        show(); //can access
    }

    // final void show(){ // can not overrida aka no modification
    //     System.out.println("Bye");
    // }
}




public class Program9
{
    public static void main(String []args)
    {

        //Q.1
                E obj = new E();
                System.out.println(obj.sum(10,15));
                obj.show("Yo Boi!");
                System.out.println(obj.show1());
                obj.m4();

        //Q.2
                F obj1 = new F();
                obj1.accessAquare(8);
                obj1.show("Vikram Chodhary");
                System.out.println(obj1.m());
                obj1.innerMeth();
                obj1.set();
                obj1.show1();

        //Q.3
                E3 obj2 = new E3();
                obj2.show();

                A3 obj3 = new E3();
                obj3.show();

                B3 obj4 = new E3();
                obj4.show();
                
                C3 obj5 = new E3();
                obj5.show();

                D3 obj6 = new E3();
                obj6.show();

        //Q.4
                B4 obj7 = new B4();
                obj7.show();

        //Q.5

                B5 obj8 = new B5();
                obj8.show2();
                obj8.show();
    }
}
