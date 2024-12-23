class Constructorgeterseter {
    public static void main(String[] args) {
        student s=new student("prem",7);
        System.out.println("Student id : "+s.getId());
        System.out.println("Student name :"+s.getName());

        
    }
}

class student
{
    private int id;
    private String name;
    student(String name, int id)
    {
            this.name=name;
            this.id=id;
    }
    int getId()
    {
        return id;
    }
     
    String getName()
    {
        return name;
    }
}
