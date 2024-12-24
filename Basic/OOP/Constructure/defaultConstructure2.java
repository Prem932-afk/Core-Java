
class defaultConstructure2 {
    public static void main(String[] args) {
        person p=new person();
        System.out.println("Name :"+p.getName());
        System.out.println("Age :"+p.getAge());

    }
}

class person
{
    private String name;
    private int age;
    person()
    {
        this.name=name;
        this.age=age;
    }
    
    String getName()
    {
        return name;
    }
    
    int getAge()
    {
        return age;
    }
}