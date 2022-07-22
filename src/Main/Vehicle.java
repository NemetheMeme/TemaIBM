package Main;

public class Vehicle {

    private String brand;   // String field
    private Engine engine;  // Class field
    private boolean isON;   // primitive field

                                //              Constructors                  //


    public Vehicle() {
        this.isON = false;
    }

    public Vehicle(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
        this.isON = false;
    }

    //              Getters and setters                 //
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
    }

                                   //          Methods             //
    
}
