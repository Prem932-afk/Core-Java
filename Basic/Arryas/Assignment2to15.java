public class Assignment2to15
{
 public static void main(String[] args) 
 {
     int sumA=0;
     int sumB=0;
      int a[]={1,2,3,4,5};
      int b[]={2,3,1,5,6};
      
      System.out.println("Array A sum");
      for(int i=0; i<a.length; i++)
      {
         sumA=sumA+a[i];
        
      }  
      System.out.println("Total number of A :"+sumA);

      System.out.println("Array B sum");

      for(int i=0; i<a.length; i++)
      {
         sumB=sumB+b[i];
       
      }  
      System.out.println("Total number of B :"+sumB);
      if(sumA > sumB)
      {
        System.out.println("A is greator");
      }
      else
      {
        System.out.println("B is greotr");
      }
      

      
 }    
}
