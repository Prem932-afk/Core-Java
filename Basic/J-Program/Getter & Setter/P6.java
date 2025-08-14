//Q.6)
 
//Getter and Setter for Array.

//Create a class Marks with a private field grades (int array). Write setter and getter methods for the grades array.

class P6
{
    public static void main(String[] args) 
    {
         Marks m=new Marks();
           
         int mygrades[]={10,20,30,40,50};
         m.setGrades(mygrades);

         int result[]=m.getGrades();
         System.out.println("Grades are:");

         for(int grade:result)
         {
            System.out.println(grade);
         }
    }
}

class Marks
{
    private int grades[];

    void setGrades(int grades[])
    {
        this.grades=grades;
    }

    int []getGrades()
    {
        return grades;
    }

}