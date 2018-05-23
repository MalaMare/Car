
public class Main {
  
    
    public static void main(String[] args) {
       
        Car myCar = new Car();
//      myCar.printAttributes();
//        myCar.changeLicence("efg123");
//        myCar.printAttributes();
//        double distance = myCar.maxDistance();
//        System.out.println("Max distanca: " + distance);
        
        Car audi = new Car("Audi", 50, 2);
        audi.printAttributes();
//        audi.changeLicence("xzy123");
//        audi.printAttributes();
//        System.out.println("Max distanca: " + audi.maxDistance());

        audi.fuelUp();
        audi.travel(20);
        audi.printAttributes();
        audi.travel(30);
        audi.printAttributes();
    }
    
}
