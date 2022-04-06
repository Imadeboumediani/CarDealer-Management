package business;

import data.CarsDataMock;
import model.Car;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CarBusinessImpl implements CarBusiness {
    List<Car> Cars= CarsDataMock.getCars();

    /** get Car by his ID **/
    public Optional<Car> get (String id){

        return Cars.stream().
                filter(Car -> Objects.equals(Car.getId(), id)).findFirst();
    }

    /** get Cars by his model **/

    public Optional<Car> getCarbymodel(String model){

        return Cars.stream().
                filter(Car -> Objects.equals(Car.getModel(), model)).findFirst();
    }


    /** get Cars by his make **/

    public Optional<Car> getCarbyMake (String make){

        return Cars.stream().
                filter(Car -> Objects.equals(Car.getMake(), make)).findFirst();
    }



    /** get Car by his price **/
    public Optional<Car> getCarbyprice (String email){

        return Cars.stream().
                filter(Car -> Objects.equals(Car.getPrice(), email)).findFirst();
    }


    /** List all his Cars **/
    public List<Car> getList() {return Cars;}

}
