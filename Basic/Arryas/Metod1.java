public class Metod1 
{
  public static void main(String[] args) 
  {
     int number=12345;
     
     //1.Convert into string

     String str=Integer.toString(number);

     //2. Splid itno two part

     String part1=str.substring(0, 3);

     String part2=str.substring(3);

     //3. Convert into number

     int num1= Integer.parseInt(part1);

     int num2= Integer.parseInt(part2);

     //4. Squar of the nubmer 

     int result =(num1*num1) + (num2*num2);

     //5. Result

     System.out.println(result);
  }    
}
