package business;

import model.Bill;
import model.Car;
import model.Concessionary;

import java.util.List;
import java.util.Optional;

public interface ConcessionnaryBusiness {
    /**
     * Get Concessionary by id
     *
     * @param name Concessionary identifiant
     * @return Concessionary find by name
     */
    Optional<Concessionary> get(String name);

    /**
     * Get Concessionary by grade
     *
     * @param grade Concessionary identifiant
     * @return Concessionary find by grade
     */
    Optional<Concessionary> getConcessionaryCar(Car car);

    /**
     * Get Concessionary by email
     *
     * @param email Concessionary identifiant
     * @return Concessionary find by email
     */
    Optional<Concessionary> getConcessionaryBills(List<Bill> Bill);


    /**
     * Get student list
     *
     * @return list of Concessionarys
     */
    List<Concessionary> getList();
}
