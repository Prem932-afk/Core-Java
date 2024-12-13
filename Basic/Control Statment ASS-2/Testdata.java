import java.util.Scanner;

class Testdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollno;
        System.out.println("Enter your rollNo");
        rollno = sc.nextInt();
        char name;
        System.out.println("Enter your name");
        name = sc.next().charAt(0);
        char fname;
        System.out.println("Enter your Father name");
        fname = sc.next().charAt(0);
        char mname;
        System.out.println("Enter your Mother name");
        mname = sc.next().charAt(0);
        
        System.out.println("Enter your address");
        String address = sc.nextLine();
        int contactno;
        System.out.println("Enter your ContactNo");
        contactno = sc.nextInt();
        int phy, che, com;
        System.out.println("Enter your physics marks");
        phy = sc.nextInt();
        System.out.println("Enter your cheistry marks");
        che = sc.nextInt();
        System.out.println("Enter your computer marks");
        com = sc.nextInt();
        int total = phy + che + com;
        System.out.println("Total marks" + total);
        float precentage = (total / 3) * 100;
        System.out.println(precentage);
        if (precentage >= 60) {
            System.out.println("First Division");

        } else if (precentage > 45 && precentage < 60) {
            System.out.println("Second Division");
        } else if (precentage < 45 && precentage >= 33) {
            System.out.println("Third Division");
        } else {
            System.out.println("Your are faill");
        }

    }
}
// student name :
// fname:
// mname:
// address:
// contact:
// Input the marks of Physics, Chemistry and Computer Application : 70 80 90
// total:
// precentage : %
// division:
