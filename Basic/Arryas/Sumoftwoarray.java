public class Sumoftwoarray 
{
    public static void main(String[] args) 
    {
       
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int c[]=new int[a.length];
    
        for(int i=0; i<a.length; i++)
        {
           
             c[i]= a[i] + b[i];
        }
        
       for(int sum : c)
       {
           System.out.println(sum);
       }
    }
}
