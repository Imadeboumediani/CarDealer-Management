package data;

import model.Concessionary;

import java.util.Arrays;
import java.util.List;

public class ConcessionnaryDataMock {
    static Concessionary getConcessionnary() {
        return new Concessionary(
                "CarDealer 29",
                "19 rue de loin Brest",
                CollabsDataMock.getCollabs(),
                CarsDataMock.getCars(),
                ClientsDataMock.getClients(),
                BillsDataMock.getBills()
        );
    }
        public static List<Concessionary> getConcessionnaries(){
            return Arrays.asList(
                    getConcessionnary()
            );
        }
    }

