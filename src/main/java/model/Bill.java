package model;

public class Bill {

    private String id;
    Client client;
    Car car;
    Collab collaborRelated;
    private String date;

    public Bill(){}

    public Bill(String id, Client client, Car car, Collab collaborRelated, String date) {
        this.id = id;
        this.client = client;
        this.car = car;
        this.collaborRelated = collaborRelated;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Collab getCollaborRelated() {
        return collaborRelated;
    }

    public void setCollaborRelated(Collab collaborRelated) {
        this.collaborRelated = collaborRelated;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bills{" +
                "id='" + id + '\'' +
                ", client=" + client +
                ", car=" + car +
                ", collaborRelated=" + collaborRelated +
                ", date='" + date + '\'' +
                '}';
    }
}
