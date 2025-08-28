public class P1 
{
   enum month
   {
      jan(1),feb(2),marl(3);

      private int value;

      //Private Constructure
      private month(int value)
      {
          this.value=value;
      }


     // Getter method
      int getMonth()
      {
         return value;
      }
   }    

   public static void main(String[] args) 
   {
     for(month m: month.values())
     {
        System.out.println(m);
     } 
   }
}
