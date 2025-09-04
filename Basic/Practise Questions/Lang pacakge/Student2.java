class Student2
{
    private int age;
    private String name;

    Student2(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    // Proper hashCode implementation
    @Override 
    public int hashCode()
    {
        return age + name.hashCode();
    }

    // Override toString() for printing
    @Override
    public String toString()
    {
        return "Student2[age=" + age + ", name=" + name + "]";
    }

    public static void main(String args[])
    {
        Student2 s = new Student2(10, "Rahul");
        System.out.println(s);
        System.out.println("HashCode: " + s.hashCode());
    }
}
