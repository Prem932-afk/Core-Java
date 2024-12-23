public class PerametrConstucutre3 {
    public static void main(String[] args) {
        Car c=new Car("2022","Kia Seltos");
        System.out.println("Car model :"+c.getYear());
        System.out.println("Car year :"+c.getModel());
        
    }
}

class Car
{
    private String year;
    private String model;
    Car(String year, String model)
    {
           this.year=year;
           this.model=model;
    }
    
    String getYear()
    {
        return year;
    }

    String getModel()
    {
        return model;
    }

}