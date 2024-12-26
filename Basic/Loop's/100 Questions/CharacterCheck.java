import java.util.Scanner;

 class CharacterCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
     
        if (Character.isAlphabetic(ch)) 
        {
            System.out.println(ch + " is an alphabet.");
        } 
        else if (Character.isDigit(ch)) 
        {
            System.out.println(ch + " is a digit.");
        } 
        else
        {
            System.out.println(ch + " is a special character.");
        }
        
      
        sc.close();
    }
}