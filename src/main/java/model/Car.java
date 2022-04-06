package model;

public class Car extends Vehicle{
    private String id;
    private int numDoors;
    private boolean automatic;
    private String color;
    private String maxSpeed;
    private int price;



    /*** constructors ***/

    public Car(){}

    public Car(String id,int numDoors, boolean automatic, String color, String maxSpeed, int price) {
        this.id=id;
        this.numDoors = numDoors;
        this.automatic = automatic;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;

    }

    public Car(String make, String model, int year, int numWheels,String id, int numDoors, boolean automatic, String color, String maxSpeed, int price ) {
        super(make, model, year, numWheels);
        this.id =id;
        this.numDoors = numDoors;
        this.automatic = automatic;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    /*** getters  and setters ***/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*** printing to String ***/
    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", numDoors=" + numDoors +
                ", automatic=" + automatic +
                ", color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", price=" + price +
                '}';
    }
}
