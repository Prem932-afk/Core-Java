/* 
Q.4
 
12,67,46,435,67,385,335,335,34

backward direction 
*/


public class Program4 
{
    public static void main(String[] args) 
    {
        int a[] = { 12, 67, 46, 435, 67, 385, 335, 335, 34 };

        for (int i = a.length - 1; i > 0; i--) 
        {
            System.out.println(a[i]);
        }
    }
}