
// 2. Split into two parts; reverse each part; return their sum.  
// Input: 6524  
// Output: 98  
// Explanation: 65 → 56, 24 → 42, sum = 98
public class P2 
{
  int reverse(int num)
  {
    int rev=0;
    while(num > 0)
    {
         rev=rev*10 + (num % 10);
         num=num/10;
    }
    return rev;
  }  
  
  public static void main(String[] args) 
  {
      int number=6524;
      
      F2 obj=new F2();

      String str= Integer.toString(number);
      
      String part1=str.substring(0,2);
      String part2=str.substring(2);

      int num1=Integer.parseInt(part1);
      int num2=Integer.parseInt(part2);

      int rev1=obj.reverse(num1);
      int rev2=obj.reverse(num2);

       int result = rev1 + rev2;

      System.out.println("Your result: " + result);
  }
}
