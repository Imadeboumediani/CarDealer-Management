import business.ConcessionnaryBusinessImpl;
import data.BillsDataMock;
import data.CarsDataMock;
import data.ClientsDataMock;
import data.CollabsDataMock;
import helper.Helper;
import model.Concessionary;

import java.util.List;


public class Main {
    public static void main (String[] args){

        Concessionary Test = new Concessionary(
                "CarDealer 29",
                "19 rue de loin Brest",
                CollabsDataMock.getCollabs(),
                CarsDataMock.getCars(),
                ClientsDataMock.getClients(),
                BillsDataMock.getBills()
        );


        ConcessionnaryBusinessImpl concessionbus = new ConcessionnaryBusinessImpl();
        List<Concessionary> concession = concessionbus.getList();

        Helper.generateJson(concession);
    }
}
