
// Q.3) Implement a program where a Car class inherits from a Vehicle class, and call the inherited method in the subclass.


public class P3 
{
    public static void main(String[] args) 
	{
        Car c=new Car("Mahindra", 180, 4);
    }
}
class Vehicle
{
    String Brand;
    int speed;

    Vehicle(String Brand, int speed)
    {
        this.Brand=Brand;
        this.speed=speed;

        System.out.println("Brand : " + Brand);
        System.out.println("Speed : " + speed);
    }

}

class Car extends Vehicle
{
    int doors;

    Car( String Brands, int speed, int doors)
    {
        super(Brands, speed);
        this.doors=doors;
        System.out.println("Doors : " + doors);
    }
}