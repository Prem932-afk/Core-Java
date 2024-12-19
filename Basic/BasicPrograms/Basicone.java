import java.util.Scanner;

class basicone {
   basicone() {
   }

   public static void main(String[] var0) {
      Scanner var3 = new Scanner(System.in);
      System.out.println("Enter your first number");
      int var1 = var3.nextInt();
      System.out.println("Enter your second number");
      int var2 = var3.nextInt();
      int var4 = var1 + var2;
      System.out.println(var4);
      var3.close();
   }
}
