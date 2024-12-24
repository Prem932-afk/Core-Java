
class Basicgreterseter1
{
    public static void main(String[] args) {
        person p=new person("prem", 18);
        System.out.println( "Person name :"+p.getName());
        System.out.println("Person Age :"+p.getAge());
    }
}
class person
{
          private String name;
          private int age;
          
          person(String name, int age)
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