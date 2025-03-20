public class ReverseString 
{			  
  public static void main(String args[])
  {
     //apprach 1
    String str="prasoon";
    //System.out.println(str.length());
    char[] charArray=str.toCharArray();
    for(int i=charArray.length-1; i>=0; i--)
    {
      System.out.print(charArray[i]);
    }
    System.out.println("==================");
    //apprach 2 charAt()
     for(int i=str.length()-1; i>=0; i--)
     {
       System.out.println(str.charAt(i));
     }
     //apprach 3 reverse() method StringBuffer
    StringBuffer sb=new StringBuffer(str);
    StringBuffer reversedString= sb.reverse();
    System.out.println(reversedString);
    
    //approach 4  reverse method which is inside the String Buider class
    System.out.println("===============");
    StringBuilder sbl =new StringBuilder(str);
    StringBuilder reversesb =sbl.reverse();
    System.out.println(reversesb);
  }	   
}