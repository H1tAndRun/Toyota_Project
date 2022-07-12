import car_details.*;
import car_model.Camry;


import car_model.Dyna;
import car_model.Hiance;
import car_model.Solara;
import factory.AssemblyLine;
import factory.Country;
import factory.ManufacturingFactory;

import static car_details.Radius.*;
import static car_details.Transmission.*;

public class Runner {
    public static void main(String[] args) throws Exception {
        ManufacturingFactory manufacturingFactory=new ManufacturingFactory(Country.RUSSIAN);
        AssemblyLine assemblyLine=new AssemblyLine(Country.RUSSIAN,manufacturingFactory);

        Camry camry= assemblyLine.createCamry("Black",1000000);
        camry.StartMoving();
        camry.getUsb().onMusic();

        Solara solara=assemblyLine.createSolara("Red",15000000);
        solara.StartMoving();
        solara.getMiniFridge().fridge();

        Hiance hiance=assemblyLine.createHiance("White",4000000);
        hiance.StartMoving();
        hiance.getCapacity();
        hiance.UseLight();

        Dyna dyna=assemblyLine.createDyna("Blue",5000000);
        dyna.StartMoving();
        dyna.getSocket().charge();






    }
}
