
class Building 
{
    String address;
    int yearBuilt;

   
    void building(String address, int yearBuilt) 
    {
        this.address = address;
        this.yearBuilt = yearBuilt;
    }

    
     void displayDetails() 
     {
        System.out.println("Address: " + address);
        System.out.println("Year Built: " + yearBuilt);
        System.out.println("This is a general building.");
    }

   
}


class House extends Building 
{
    int numberOfRooms;

  
    void pouse(int numberOfRooms) 
    {
       
        this.numberOfRooms = numberOfRooms;
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("This is a residential house.");
    }

  
        
}


class Mansion extends House 
{
    boolean hasSwimmingPool;


    void mansion( boolean hasSwimmingPool) 
    {
       
        this.hasSwimmingPool = hasSwimmingPool;
        System.out.println("Has Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No"));
        System.out.println("This is a luxurious mansion with high-end features.");
    
    }

}
class Method31 
{
    public static void main(String[] args) 
    {
       Mansion m=new Mansion();
       m.mansion(false);
       m.pouse(5);
       m.building("Rajasthan", 5);
       m.displayDetails();
    }
}

