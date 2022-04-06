import helper.Helper;
import model.Car;



public class Main {
    public static void main (String[] args){

          Car bm= new Car("Bmw","Serie1",2012,4,5,true,"Black","180",20000);


        Helper.generateJson(bm);
    }
}
