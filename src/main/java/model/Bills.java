package model;

public class Bills {

    private String id;
    Clients client;
    Cars car;
    Collabs collaborRelated;
    private String date;

    public Bills(){}

    public Bills(String id, Clients client, Cars car, Collabs collaborRelated, String date) {
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

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }

    public Collabs getCollaborRelated() {
        return collaborRelated;
    }

    public void setCollaborRelated(Collabs collaborRelated) {
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
