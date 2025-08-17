public class M2 
{
       
       int reverse(int num)
       {
          int rev=0;
          while(num>0)
          {
            rev=rev*10 + (num % 10);
            num=num/10;
          }
          return rev;
       }
   public static void main(String[] args) 
   {
       int num=6524;
    
       M2 m=new M2();

       //1. Convert into string 

       String str=Integer.toString(num);

       //2. Split into two parts

       String part1=str.substring(0,2);

       String part2=str.substring(2);

       //3. Conver into number 

       int num1= Integer.parseInt(part1);

       int num2= Integer.parseInt(part2);

       //4. Reverse number 

       int obj1= m.reverse(num1);

       int obj2=m.reverse(num2);

       //5. sum of two number 

       int result= num1 + num2;

       System.out.println(result);
        

   }    
}
