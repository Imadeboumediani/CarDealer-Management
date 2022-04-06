package business;

import model.Bill;
import model.Client;

import java.util.List;
import java.util.Optional;

public interface BillBusiness {
    /**
     * Get Bill by id
     *
     * @param id Bill identifiant
     * @return Bill find by id
     */
    Optional<Bill> get(String id);

    /**
     * Get Bill by city
     *
     * @param date Bill identifiant
     * @return Bill find by city
     */
    Optional<Bill> getBillbyDate(String date);

    /**
     * Get Bill by email
     *
     * @param Client Bill identifiant
     * @return Bill find by email
     */
    Optional<Bill> getBillbyClient(Client client);


    /**
     * Get student list
     *
     * @return list of Bills
     */
    List<Bill> getList();
}
