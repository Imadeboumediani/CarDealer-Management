package data;

import model.Bill;

import java.util.Arrays;
import java.util.List;

public class BillsDataMock {
    static Bill getBill_1(){
        return new Bill(
                "1",
                ClientsDataMock.getClient_1(),
                CarsDataMock.getpeaugot306(),
                CollabsDataMock.getVendeur(),
                "10-08-2021"
        );
    }

    static Bill getBill_2(){
        return new Bill(
                "2",
                ClientsDataMock.getClient_2(),
                CarsDataMock.getFordfocus(),
                CollabsDataMock.getDirecteur(),
                "10-07-2021"
        );
    }

    static Bill getBill_3(){
        return new Bill(
                "3",
                ClientsDataMock.getClient_3(),
                CarsDataMock.getBmwserie1(),
                CollabsDataMock.getVendeur(),
                "10-06-2021"
        );
    }

    public static List<Bill> getBills(){
        return Arrays.asList(
                getBill_1(),
                getBill_2(),
                getBill_3()
        );
    }
}

