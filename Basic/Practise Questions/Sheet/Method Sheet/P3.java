//Q.3  Split into 3 parts; return (part1 * part2) - (part3²) ?
//    Input: 123456 
//    Output: -2728  
//    Explanation: 12*34 - 56² = 408 - 3136
public class P3 
{
   public static void main(String[] args) 
   {
       int number = 123456;
       
       //1. Number convert into String 
       String str=Integer.toString(number);

       //2. Split into 3 parts
       String str1=str.substring(0, 2);
       String str2=str.substring(2,4);
       String str3=str.substring(4,6);

       //3. Convert into number 
       int num1=Integer.parseInt(str1);
       int num2=Integer.parseInt(str2);
       int num3=Integer.parseInt(str3);

       //4. Result 
       int result=(num1 * num2 ) - (num3 * num3);

       //5. Print result 
       System.out.println(result);
   }   
}
