package model;

import java.util.List;

public class Concessionary {
    private String name;
    private String adress;
    List<Collabs> CollabsList;
    List<Cars> CarsList;
    List<Clients> ClientsList;
    List<Bills> BillsList;

    public Concessionary(){};

    public Concessionary(String name, String adress, List<Collabs> collabsList, List<Cars> carsList, List<Clients> clientsList, List<Bills> billsList) {
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

    public List<Collabs> getCollabsList() {
        return CollabsList;
    }

    public void setCollabsList(List<Collabs> collabsList) {
        CollabsList = collabsList;
    }

    public List<Cars> getCarsList() {
        return CarsList;
    }

    public void setCarsList(List<Cars> carsList) {
        CarsList = carsList;
    }

    public List<Clients> getClientsList() {
        return ClientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        ClientsList = clientsList;
    }

    public List<Bills> getBillsList() {
        return BillsList;
    }

    public void setBillsList(List<Bills> billsList) {
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
