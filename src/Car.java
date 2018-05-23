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

public Car() {
        this.model = "defauld";
        this.maxFuel = 100;
        this.consumption = 5;

}

    public Car(String customModel, int customMaxFuel, int customConsumption) {
        
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        
    }
    
    public void printAttributes() {
    
        System.out.println("Model: " + this.model);
        System.out.println("Max Fuel: " + this.maxFuel);
        System.out.println("Consumprion: " + this.consumption);
        System.out.println("Licence: " + this.licence);
        System.out.println("Current fuel: " + this.currentFuel);
        System.out.println("Distance: " + this.mileage);
        
    }


    public void changeLicence(String customLicence) {
        this.licence = customLicence;
    }

    public void changeWeight (int newWeight) {
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
        
        if (this.currentFuel  >= distance * this.consumption) {
            this.mileage = this.mileage + distance;
        this.currentFuel = this.currentFuel - distance * this.consumption;
        } else {
            System.out.println("Nema dovoljno goriva");
        }
            
        
        this.mileage = this.mileage + distance;
        this.currentFuel = this.currentFuel - distance * this.consumption;
    }

    
}


