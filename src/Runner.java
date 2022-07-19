import people.Buyer;
import car_model.Camry;


import car_model.Dyna;
import car_model.Hiance;
import car_model.Solara;
import factory_car.AssemblyLine;
import factory_car.ManufacturingFactory;
import people.CashIer;
import people.Manager;
import stock_car.Stock;
import type_car.Car;

import static factory_car.Country.*;

public class Runner {

    public static void main(String[] args) throws Exception {
        Stock stock = new Stock();
        ManufacturingFactory factory = new ManufacturingFactory(JAPAN);
        AssemblyLine assemblyLine = new AssemblyLine(JAPAN, factory);

        Camry camry1=assemblyLine.createCamry("white",10000);
        Camry camry2=assemblyLine.createCamry("black",12000);
        Camry camry3=assemblyLine.createCamry("red",15000);
        Camry camry4=assemblyLine.createCamry("yellow",22000);

        stock.addCarCamry(camry1);
        stock.addCarCamry(camry2);
        stock.addCarCamry(camry3);
        stock.addCarCamry(camry4);

        Manager manager =new Manager(stock,assemblyLine);

        Buyer buyer1=new Buyer(10000,"Jon");
        Car car1= manager.sellACar(buyer1);
        CashIer.addToSum(car1);

        Buyer buyer2=new Buyer(12000,"Denis");
        Car car2= manager.sellACar(buyer2);
        CashIer.addToSum(car2);

        Buyer buyer3=new Buyer(15000,"Petr");
        Car car3= manager.sellACar(buyer3);
        CashIer.addToSum(car3);

        Buyer buyer4 =new Buyer(22000,"Ivan");
        Car car4= manager.sellACar(buyer4);
        CashIer.addToSum(car4);

        Buyer buyer5=new Buyer(11000,"Pasha");
        Car car5=manager.sellACar(buyer5);
        CashIer.addToSum(car5);

        Buyer buyer6=new Buyer(13000,"Evgenii");
        Car car6=manager.sellACar(buyer6);
        CashIer.addToSum(car6);

        Buyer buyer7=new Buyer(8000,"Egor");
        Car car7=manager.sellACar(buyer7);
        CashIer.addToSum(car7);

        Buyer buyer8=new Buyer(30000,"Roman");
        Car car8=manager.sellACar(buyer8);
        CashIer.addToSum(car8);

        CashIer.getToSum();
















    }
}
