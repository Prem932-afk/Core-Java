// Q.2  Split into two parts; reverse each part; return their sum ?
//    Input: 6524 
//    Output: 98 
//    Explanation: 65 → 56, 24 → 42, sum = 98
public class P2 
{
 

   int revevrse(int num)
   {
      int  rev=0;
      while(num>0)
      {
         rev=rev * 10 + (num % 10);
         num=num / 10;
        
      }
       return rev;
   }

}

class Demo
{
    public static void main(String[] args) 
    {
        int number=6524;
        
        P2 obj=new P2();

        //1. Convert into number 
        String str=Integer.toString(number);

        //2. Split into two parts 
        String part1=str.substring(0,2);
        String part2=str.substring(2);

        //3. Convert into Number
        int num1=Integer.parseInt(part1);
        int num2=Integer.parseInt(part2);

        //4. Reverse Number 
        int obj1= obj.revevrse(num1);
        int obj2= obj.revevrse(num2);
 
        //5. Sum 

        int reuslt= obj1 + obj2;

        //6. print result 
        System.out.println(reuslt);

    }
}
