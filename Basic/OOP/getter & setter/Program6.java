public class Program6
{
    
    private int[] grades;

    public void setGrades(int[] grades) 
    {
        this.grades = grades;
    }

   
    public int[] getGrades() 
    {
        return grades;
    }
    
    
    public void displayGrades() 
    {
        if (grades != null) 
        {
            System.out.print("Grades: ");
            for (int grade : grades) 
            {
                System.out.print(grade + " ");
            }
            System.out.println();
        } 
        else 
        {
            System.out.println("No grades available.");
        }
    }

    public static void main(String[] args) 
    {
       
        Program6 studentMarks = new  Program6();

     
        int[] gradesArray = {85, 90, 78, 92, 88};
        studentMarks.setGrades(gradesArray);

        
        studentMarks.displayGrades();
    }
}

//Getter and Setter for Array.

//Create a class Marks with a private field grades (int array). Write setter and getter methods for the grades array.
