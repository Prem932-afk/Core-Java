public class Patterns16
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1; i<=4; i++)
		{ 
		    for(int s=1; s<=n-i; s++)
			{
			    System.out.print(" ");
			}
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print((char)(j+95));
		    }
		     System.out.println(" ");
		}
	}
}