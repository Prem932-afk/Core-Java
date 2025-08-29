// Q.4  Return number formed by concatenating squares of each digit.  ?
//    Input: 123 
//    Output: 149   
//    Explanation: 1²=1, 2²=4, 3²=9 → "149"
public class P4 
{
   public static void main(String[] args) 
   {
      int num=123;

     String result=" ";
    
 
    while(num>0)
    {
        int digit=0 ;
        int square=0;

        digit= num % 10;
        square=digit * digit;
        result= square + result;
        num= num / 10;

    }
    System.out.println(result); 
   }
}
