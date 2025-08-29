
// Q.6 Reverse number; return sum of digits of reversed number. ?
//    Input: 1234 
//    Output: 10  
   
public class P6 
{
   public static void main(String[] args) 
   {
     int num=1234;

     int rev=0;

     int digit=0;

     while(num>0)
     {
         digit=num % 10;
         rev=rev * 10 + digit;
         num=num / 10;   
     }
     System.out.println("reverse number :" + rev);

     int sum=0;
     while(rev>0)
     {
        digit=rev % 10;
        sum=sum + digit;
        rev=rev / 10;
     }

     System.out.println("Sum of Number : " + sum);
   }    
}
