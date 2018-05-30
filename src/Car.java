
public class Car {

    String model;
    int maxSpeed;
    int minSpeed;
    double weight;

    String licence = "abc123";
    int maxFuel;
    int currentFuel;
    int consumption; // consumption per distance unit (km)
    int mileage = 0;

    int maxPassengers;
    int curentPassengers;

    public Car() {
        this.model = "defauld";
        this.maxFuel = 100;
        this.consumption = 5;
        this.maxPassengers = 5;
        this.curentPassengers = 1;
    }

    public Car(String customModel, int customMaxFuel, int customConsumption) {

        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;

    }

    public Car(String customModel, int customMaxFuel, int customConsumption, int customMaxPassengers, int customCurrentPassengers) {

        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.maxPassengers = customMaxPassengers;
        this.curentPassengers = customCurrentPassengers;
        

    }

    public void printAttributes() {

        System.out.println("Model: " + this.model);
        System.out.println("Max Fuel: " + this.maxFuel);
        System.out.println("Consumprion: " + this.consumption);
        System.out.println("Licence: " + this.licence);
        System.out.println("Current fuel: " + this.currentFuel);
        System.out.println("Distance: " + this.mileage);
        System.out.println("Max broj putnika: " + this.maxPassengers);
        System.out.println("Trenutni broj putnika: " + this.curentPassengers);
        System.out.println();

    }

    public void changeLicence(String customLicence) {
        this.licence = customLicence;
    }

    public void changeWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double maxDistance() {
        double dist = this.maxFuel / this.consumption;
        return dist;

        //return this.maxFuel / this.consumption
    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;

    }

    public void travel(int distance) {

        //ako ima dovoljno goriva za put putuj (mileage, smanji trenutno gorivo)
        // ako nema dovoljno goriva, poruka nema dovoljno goriva
        if (this.currentFuel >= distance * this.consumption) {
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
        } else {
            System.out.println("Nema dovoljno goriva");
        }

        this.mileage = this.mileage + distance;
        this.currentFuel = this.currentFuel - distance * this.consumption;
    }

//   public void getIn () {
//       if (this.curentPassengers < this.maxPassengers)
//           this.curentPassengers = this.curentPassengers + 1;
//           //this.currentPassengers++
//           System.out.println("Neko je usao, broj putnika: " + this.curentPassengers);
//           
//         } else {
//            System.out.println("Auto je pun");   
//      }
    
    
    
//  public void getOut () {
//       if (this.curentPassengers > 0)
//           this.curentPassengers = this.curentPassengers - 1;
//           //this.currentPassengers++
//           System.out.println("Neko je izasao, broj putnika: " + this.curentPassengers);
//           
//         } else {
//            System.out.println("Nema putnika");   
//      }   
    
       
    
    public void getIn(int ulazak) {
              
        if (this.curentPassengers + ulazak <= this.maxPassengers){
            this.curentPassengers = this.curentPassengers + ulazak;
            System.out.println("ima jos mesta\n");
        } else {
            System.out.println("nema dovoljno mesta");
        }
    }

    public void getOut(int izlazak) {
        
        if (this.curentPassengers - izlazak > 0) {
            this.curentPassengers = this.curentPassengers - izlazak;
            System.out.println("ima jos mesta");
        } else {
            System.out.println("Nema putnika");
        }
        
    }
    
    
    
    
    
    
    

}

 

