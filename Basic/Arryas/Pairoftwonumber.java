public class Pairoftwonumber 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7,8,9,10 };
        int target=8;
        for(int i=0; i<a.length; i++)
        {
          for(int j=i+i; j<a.length; j++)
          {
            if(a[i]+a[j]==target)
            {
                System.out.println(a[i] + " " + a[j]);
            }
          }
        }
        System.out.println("Index");
        for(int i=0; i<a.length; i++)
        {
            System.out.println("index : "+ i + " " + "Value : " + a[i] );
        }
        System.out.println("count");
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a.length);
        }
    }
}
