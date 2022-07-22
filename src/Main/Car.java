package Main;
                                //2. Clasa derivată
public class Car extends Vehicle{

    private int noOfSeats;
    private String transmissionType;

                        //              Constructors               //

    public Car() {
        super();
    }

    public Car(String brand, String transmissionType) {

        super(brand);
        this.transmissionType = transmissionType;
    }
    public Car(String brand, String transmissionType, Engine engine){
        super(brand,engine);
        this.transmissionType = transmissionType;
    }

                              //              Getters and Setters             //

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

   @Override
    public String toString() {

        return "Car{" +
                "noOfSeats=" + noOfSeats +
                ", transmissionType='" + transmissionType + '\'' +
                 " "+ super.toString() + '}';
    }
}
