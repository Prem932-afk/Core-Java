import java.util.List;
import java.util.ArrayList;
class P3
{
    public static void main(String[] args) 
    {
          ArrayList al=new ArrayList<>();
            al.add(0,100);
            al.add(1,null);
            al.add(2,"hello");
            al.add(3,1.5);
            
        System.out.println("Arraylist pring");  
        System.out.println(al);
         System.out.println(" ");  

        System.out.println("Arraylist Size");
        System.out.println(al.size()); 
         System.out.println(" ");    
        
        System.out.println("Arraylist indexof");
        al.indexOf(al);
        System.out.println(al);  
         System.out.println(" ");    

        System.out.println("Arraylist remove Element");    
        al.remove(2);
        System.out.println(al);
         System.out.println(" ");  


        System.out.println("Arraylist clear");    
        al.clear();
        System.out.println(al);


      
    }
}