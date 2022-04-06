package data;

import enums.SexTypeEnum;
import model.Client;

import java.util.Arrays;
import java.util.List;

public class ClientsDataMock {
    static Client getClient_1(){
        return new Client("Jack","Brio",35, SexTypeEnum.MALE,"1","jack@gmail.com","Brest","RAqj5wT7_E9Sp6b", 55555);
    }

    static Client getClient_2(){
        return new Client("Jackie","Brioni",35, SexTypeEnum.MALE,"2","jackie@gmail.com","Brest","RAqj5wT7_E9Sp6b123",45444);
    }
    static Client getClient_3(){
        return new Client("laurie","Brioni",32, SexTypeEnum.FEMALE,"3","LAurie@gmail.com","Brest","RAqj5wT7_E9Sp6b456",65555);
    }
    public static List<Client> getClients(){
        return Arrays.asList(
                getClient_1(),
                getClient_2(),
                getClient_3()
        );
    }

}
