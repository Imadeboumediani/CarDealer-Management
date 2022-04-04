package model;

public class Cars extends Vehicle{
    private int numDoors;
    private boolean automatic;
    private String color;
    private String maxSpeed;
    private int price;
    private int year;


    /*** constructors ***/

    public Cars(){}

    public Cars(int numDoors, boolean automatic, String color, String maxSpeed, int price, int year) {
        this.numDoors = numDoors;
        this.automatic = automatic;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.year = year;
    }

    public Cars(String make, String model, int year, int numWheels, int numDoors, boolean automatic, String color, String maxSpeed, int price, int year1) {
        super(make, model, year, numWheels);
        this.numDoors = numDoors;
        this.automatic = automatic;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.year = year1;
    }

    /*** getters  and setters ***/
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

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    /*** printing to String ***/
    @Override
    public String toString() {
        return "Cars{" +
                "numDoors=" + numDoors +
                ", automatic=" + automatic +
                ", color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
