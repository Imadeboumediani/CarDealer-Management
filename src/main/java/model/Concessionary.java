package model;

import java.util.List;

public class Concessionary {
    private String name;
    private String adress;
    List<Collab> CollabsList;
    List<Car> CarsList;
    List<Client> ClientsList;
    List<Bill> BillsList;

    public Concessionary(){};

    public Concessionary(String name, String adress, List<Collab> collabsList, List<Car> carsList, List<Client> clientsList, List<Bill> billsList) {
        this.name = name;
        this.adress = adress;
        CollabsList = collabsList;
        CarsList = carsList;
        ClientsList = clientsList;
        BillsList = billsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Collab> getCollabsList() {
        return CollabsList;
    }

    public void setCollabsList(List<Collab> collabsList) {
        CollabsList = collabsList;
    }

    public List<Car> getCarsList() {
        return CarsList;
    }

    public void setCarsList(List<Car> carsList) {
        CarsList = carsList;
    }

    public List<Client> getClientsList() {
        return ClientsList;
    }

    public void setClientsList(List<Client> clientsList) {
        ClientsList = clientsList;
    }

    public List<Bill> getBillsList() {
        return BillsList;
    }

    public void setBillsList(List<Bill> billsList) {
        BillsList = billsList;
    }

    @Override
    public String toString() {
        return "Concessionary{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", CollabsList=" + CollabsList +
                ", CarsList=" + CarsList +
                ", ClientsList=" + ClientsList +
                ", BillsList=" + BillsList +
                '}';
    }
}
