import java.util.Scanner;

 class DaysConverter 
 {
    public static void main(String[] args)
     {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

      
        int years = totalDays / 365; 
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        remainingDays = remainingDays % 7;

  
        System.out.println(totalDays + " days is equivalent to:");
        System.out.println(years + " years");
        System.out.println(weeks + " weeks");
        System.out.println(remainingDays + " days");
        scanner .close();
       
    }
}

