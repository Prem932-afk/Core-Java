// Q.5  Sum of cubes of digits ?
//    Input: 153 
//    Output: 153
//    Explanation: 1³+5³+3³=153
public class P5 
{
  public static void main(String[] args) 
  {
      int num=153;

      int digit=0;

      int cube=0;

      while(num>0)
      {
         digit=num % 10;
         cube=cube + (digit * digit * digit);
         num= num/10;
      } 

      System.out.println(cube);
  }    
}
