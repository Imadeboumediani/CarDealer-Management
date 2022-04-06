package data;

import model.Car;

import java.util.Arrays;
import java.util.List;

public class CarsDataMock {

    static Car getpeaugot306() {
        return new Car("Peugeot","306",2012,4,"1",5,true,"Red","180",10000);
    }
    static Car getFordfocus() {
        return new Car("Ford","Focus",2012,4,"2",5,true,"Black","180",14000);
    }
    static Car getBmwserie1() {
        return new Car("Bmw","Serie1",2012,4,"3",5,true,"Black","180",20000);
    }

    public static List<Car> getCars(){
        return Arrays.asList(
                getpeaugot306(),
                getFordfocus(),
                getBmwserie1()
        );
    }

}

