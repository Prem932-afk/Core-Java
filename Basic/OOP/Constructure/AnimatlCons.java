public class AnimatlCons {
    public static void main(String[] args) {
        Animal a=new Animal("Egal", "Bird");
        System.out.println("Animal name"+a.getAnimal());
        System.out.println("Animal Specis"+a.getSpecis());
    }
}
class Animal
{
    private String animal;
    private String spesic;
    Animal(String animal,String spesic)
    {
         this.animal=animal;
         this.spesic=spesic;

    }
    String getAnimal()
    {
        return animal;
    }

    String getSpecis()
    {
        return spesic;
    }
    
}