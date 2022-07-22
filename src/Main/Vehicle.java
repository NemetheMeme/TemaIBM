package Main;
                                     // 1. Clasa principală

public class Vehicle {

    private String brand;   // String field
    private Engine engine;  // Class field
    private int speed;   // primitive field

                                //              Constructors                  //


    public Vehicle() {
        this.engine = new Engine("No type");
    }

    public Vehicle(String brand) {

        this(); // calls the default constructor, therefore it creates a "no type engine"
        this.brand = brand;
        this.speed = 0;

    }
    public Vehicle(String brand, Engine engine) {

        this.engine = engine;
        this.brand = brand;
        this.speed = 0;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
                                                 //      ToString        //

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", speed=" + speed +
                '}';
    }

                                              //          Methods             //





}
