// 3. Split into 3 parts; return (part1 * part2) - (part3²).  
// Input: 123456  
// Output: -2728  
// Explanation: 12*34 - 56² = 408 - 3136
public class P3 
{
  public static void main(String[] args) 
  {
       int number=123456;
       
       String str=Integer.toString(number);

       String part1=str.substring(0,2);
       String part2=str.substring(2,4);
       String part3=str.substring(4);


       int num1=Integer.parseInt(part1);
       int num2=Integer.parseInt(part2);
       int num3=Integer.parseInt(part3);

       int result=(num1*num2) - (num3*num3);
       System.out.println("Your result is :" + result);
  }    
}
