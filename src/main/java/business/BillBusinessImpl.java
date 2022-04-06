package business;

import data.BillsDataMock;
import model.Bill;
import model.Client;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class BillBusinessImpl implements BillBusiness{
    List<Bill> Bills= BillsDataMock.getBills();

    @Override
    public Optional<Bill> get(String id) {
        return Bills.stream().
                filter(Bill -> Objects.equals(Bill.getId(),id)).findFirst();
    }

    @Override
    public Optional<Bill> getBillbyDate(String date) {
        return Bills.stream().
                filter(Bill -> Objects.equals(Bill.getDate(),date)).findFirst();
    }

    @Override
    public Optional<Bill> getBillbyClient(Client client) {
       return Bills.stream().
                            filter(bill -> Objects.equals(bill.getClient(), client)).
                            findFirst();

    }

    @Override
    public List<Bill> getList() {
        return null;
    }
}
