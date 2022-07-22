package Main;
                                                     // 4. Clasa Main
public class Main {
    public static void main(String[] args) {
        //          Primul subpunct

        Engine internalCombustionEngine = new Engine("Internal Combustion Engine");
        Vehicle vehicle001 = new Vehicle("Toyota");   // For containment

        System.out.println("Vehicle001's engine: " + vehicle001.getEngine());
        vehicle001.setEngine(internalCombustionEngine);
        System.out.println("Vehicle001 after setting the new engine, the \"no type\" engine is gone forever : " + vehicle001.getEngine());


        Engine hybridEngine = new Engine("Hybrid");
        Vehicle vehicle002 = new Vehicle("Ford", hybridEngine);           // For aggregation
        System.out.println("Vehicle002's engine: " + vehicle002.getEngine()); // if we destroy vehicle002, hybridEngine still exists


        //      Al doilea subpunct si al treilea subpunct

        Vehicle car001 = new Car("Skoda", "Manual", internalCombustionEngine); // instance of Vehicle
        Car car002 = new Car(); // instance of Car

        System.out.println("Car001: " + car001 );
        System.out.println("Car002 BEFORE changing its proprieties: "+ car002);
        // First instance is an instance of Vehicle, even if we initialize it as a Car, we cant use Car Class' methods and proprieties

        //car001.getNoOfSeats();
        //car001.getTransmissionType();
        //car001.getNoOfSeats();

        // For second instance we can use all of its parent's methods and proprieties
        car002.setNoOfSeats(4);
        car002.setTransmissionType("Automatic");
        car002.setSpeed(230);
        car002.setBrand("Wolkswagen");
        car002.setEngine(internalCombustionEngine);
        System.out.println("Car002 AFTER changing its proprieties: " + car002);

        car001.setSpeed(160);
        car001.getEngine().setON(true);
        car001.getEngine().setType("Electric");
        System.out.println("Car001 AFTER changing its proprieties: " + car001);

        Car car003 = (Car)car001; // we can cast car001 to a Car instance and then operate on the new object with car001's proprieties

        // but we can't cast car001 as a vehicle to a Car instance
        //Car car004 = car001;  //Incompatible types compiling error

        car003.setNoOfSeats(9);
        car003.setTransmissionType("Automatic");
        System.out.println("Casted car003 of car001: " + car003);




    }
}
