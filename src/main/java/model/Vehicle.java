package model;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private int kilometers;
    private String plateNumber;

    /*** constructors ***/
    public Vehicle() {
    }

    public Vehicle(String make, String model, int year, int numWheels) {
        this.make = make;
        this.model = model;
        if (year < 1900) {
            throw new IllegalArgumentException();
        }
        this.year = year;
        this.numWheels = numWheels;
        this.kilometers = 0;
        this.plateNumber = "unknown";
    }



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900) {
            throw new IllegalArgumentException();
        }
        this.year = year;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }


    /*** printing to String ***/
    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numWheels=" + numWheels +
                ", kilometers=" + kilometers +
                ", plateNumber='" + plateNumber + '\'' +
                '}';
    }
}