import java.util.Scanner;
class Lengthconverotr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Length in centimerer :");
        double centimeter=sc.nextDouble();
        double meter=centimeter/100; //100 cm=1 meter
        double kilometer=centimeter/100000;//100000 cm= 1km
        System.out.println("Your meter :"+meter);
        System.out.println("Your kilometer"+kilometer);
        //meter to kilometer
        System.out.println("Enter your meter");
        double mtr=sc.nextDouble();
        double kilomtr=mtr/1000;
        //1000 meter=1km
        System.out.println("Your kilometer : "+kilomtr);
       
    }
}
