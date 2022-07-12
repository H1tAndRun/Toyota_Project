import car_model.Camry;


import car_model.Solara;
import factory_car.AssemblyLine;
import factory_car.Country;
import factory_car.ManufacturingFactory;
import stock_car.Stock;

import java.util.Arrays;

import static factory_car.Country.*;

public class Runner {
    public static void main(String[] args) throws Exception {
        ManufacturingFactory manufacturingFactory = new ManufacturingFactory(RUSSIAN);
        AssemblyLine assemblyLine = new AssemblyLine(Country.RUSSIAN, manufacturingFactory);

        Solara solara2=assemblyLine.createSolara("Red",2000000);
        Solara solara=assemblyLine.createSolara("White",1999);
        Camry camry = assemblyLine.createCamry("Black", 1000000);

        Stock stock =new Stock();
        stock.addCarSolara(solara2);
        stock.addCarSolara(solara);
        stock.addCarCamry(camry);

        stock.getCountCar();
        stock.getMaxCountCar();

        stock.getCountCamry();
        stock.getCountSolara();

        System.out.println(stock.getCamry());
        System.out.println(stock.getSolara());
        System.out.println(stock.getSolara());

        stock.getCountCar();
        stock.getMaxCountCar();

        stock.getCountCamry();
        stock.getCountSolara();
















    }
}
