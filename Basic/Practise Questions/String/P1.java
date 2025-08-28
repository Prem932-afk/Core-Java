class P1
{
    public static void main(String args[])
    {
        String s1=new String("Hello");

        s1.concat("World");
        
        System.out.println(s1);

        s1= s1.concat(" World");

        System.out.println(s1);
        
    }
}