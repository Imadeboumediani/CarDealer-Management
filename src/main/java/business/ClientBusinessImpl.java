package business;

import data.ClientsDataMock;
import model.Client;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class ClientBusinessImpl implements ClientBusiness {

    /** Creating a new List of CLients from datamock **/
    List<Client> clients= ClientsDataMock.getClients();

    /** get Client by his ID **/
    public Optional<Client> get (String id){

        return clients.stream().
                filter(client -> Objects.equals(client.getId(), id)).findFirst();
    }

    /** get Clients by his city
     * @return**/
    public Stream<Client> getClientbyCity (String city){

        return clients.stream().
                filter(client -> Objects.equals(client.getCity(), city));
    }

    /** get Client by his email **/
    public Optional<Client> getClientbyemail (String email){

        return clients.stream().
                filter(client -> Objects.equals(client.getId(), email)).findFirst();
    }


    /** List all his clients **/
    public List<Client> getList() {return clients;}


}
