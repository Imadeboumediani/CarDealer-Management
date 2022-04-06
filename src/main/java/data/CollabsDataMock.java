package data;

import enums.GradeEnum;
import enums.SexTypeEnum;
import model.Collab;

import java.util.Arrays;
import java.util.List;

public class CollabsDataMock {
    static Collab getDirecteur(){
        return new Collab("Imade","Boumediani",25, SexTypeEnum.MALE,GradeEnum.DIRECTEUR,"boumediani.pro@gmail.com","19 rue de la soin",1,48000);
    }

    static Collab getAssistant(){
        return new Collab("Jean","Michel",21, SexTypeEnum.MALE,GradeEnum.ASSISTANT,"jean@gmail.com","15 rue de la soin",2,28000);
    }

    static Collab getVendeur(){
        return new Collab("Laura","Michel",23, SexTypeEnum.FEMALE,GradeEnum.VENDEUR,"Laura@gmail.com","10 rue de la soin",3,25000);
    }

    public static List<Collab> getCollabs(){
        return Arrays.asList(
                getDirecteur(),
                getAssistant(),
                getVendeur()
        );
    }
}
