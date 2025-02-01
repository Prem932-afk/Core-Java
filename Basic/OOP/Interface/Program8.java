/*
interface A
	method :show()

interface B 
	method :show()

interface C 
	method :show()

interface D
	method :show()

class implements 
    */


    interface A3
    {
        void show();
    }
    interface B3
    {
        void show();
    }
    interface C3
    {
        void show();
    }
    interface D3
    {
        void show();
    }
    class E3 implements A3,B3,C3,D3
    {
        public void show()
        {
            System.out.println("Its overridden for all same namem method in all interface");
        }
    }
    
    
    // Final Variable
    
    interface A4
    {
        int a = 34; // its by default public and final
    }
    class B4 implements A4
    {
        public void show()
        {
            System.out.println(a); // accessble
            // a = 3; // throw Error - can not reaassign final variable
            // System.out.println(a); 
        }
    }
    
