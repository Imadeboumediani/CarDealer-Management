package business;

import model.Client;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface ClientBusiness {


    /**
     * Get Client by id
     *
     * @param id Client identifiant
     * @return Client find by id
     */
    Optional<Client> get(String id);

    /**
     * Get Client by city
     *
     * @param city Client identifiant
     * @return Client find by city
     */
    Stream<Client> getClientbyCity(String city);

    /**
     * Get Client by email
     *
     * @param email Client identifiant
     * @return Client find by email
     */
    Optional<Client> getClientbyemail(String email);


    /**
     * Get student list
     *
     * @return list of CLients
     */
    List<Client> getList();

}



