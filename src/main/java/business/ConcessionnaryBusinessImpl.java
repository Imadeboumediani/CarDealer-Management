package business;

import data.ConcessionnaryDataMock;
import model.Bill;
import model.Car;
import model.Concessionary;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ConcessionnaryBusinessImpl implements ConcessionnaryBusiness{

    List<Concessionary> concessionaries = ConcessionnaryDataMock.getConcessionnaries();

    @Override
    public Optional<Concessionary> get(String name) {
        return concessionaries.stream().
                filter(conc -> Objects.equals(conc.getName(),name)).findFirst();
    }

    @Override
    public Optional<Concessionary> getConcessionaryCar(Car car) {
        return concessionaries.stream().
                filter(conc -> Objects.equals(conc.getCarsList(),car)).findFirst();
    }

    @Override
    public Optional<Concessionary> getConcessionaryBills(List<Bill> Bill) {
        return concessionaries.stream().
                filter(conc -> Objects.equals(conc.getBillsList(),Bill)).findAny();
    }

    @Override
    public List<Concessionary> getList() {
        return concessionaries;
    }
}
