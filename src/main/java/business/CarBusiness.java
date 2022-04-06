package business;

import model.Car;

import java.util.List;
import java.util.Optional;

public interface CarBusiness {

    /**
     * Get Car by id
     *
     * @param id Car identifiant
     * @return Car finds by  id
     */
    Optional<Car> get(String id);

    /**
     * Get Car by city
     *
     * @param model Car identifiant
     * @return Car finds by city
     */
    Optional<Car> getCarbymodel(String model);

    /**
     * Get Car by email
     *
     * @param make Car identifiant
     * @return Car find sby make
     */
    Optional<Car> getCarbyMake (String make);

    /**
     * Get Car by email
     *
     * @param email Car identifiant
     * @return Car finds by make
     */
    Optional<Car> getCarbyprice (String email);

    /**
     * Get student list
     *
     * @return list of Cars
     */
    List<Car> getList();
}
