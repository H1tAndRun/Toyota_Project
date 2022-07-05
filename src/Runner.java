import car_details.*;
import car_brands.Camry;
import car_brands.Dyna;
import car_brands.Hiance;
import car_brands.Solara;
import static car_details.Radius.*;
import static car_details.Transmission.*;

public class Runner {
    public static void main(String[] args) throws Exception {
        Runner runner= new Runner();
        runner.CreateCamry();
        System.out.println();
        runner.CreateSolara();
        System.out.println();
        runner.CreateDyna();
        System.out.println();
        runner.CreateHiance();
    }

    public Camry CreateCamry() throws Exception {
        Wheels[] wheels = new Wheels[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i]=new Wheels(false, R17);
        }
        Camry camry = new Camry(new GasTank(5), new Engine(true), new Electrician(true), new Lights(),wheels);
        camry.setColor("Белый");
        camry.setMaxSpeed(250);
        camry.setPriceCar(1_000_000);
        camry.setTransmission(AKPP);
        camry.StartMoving();
        camry.UseLight();
        camry.StopMoving();
        camry.UseCruiseControl(true);
        camry.Music();
        return camry;
    }

    public Dyna CreateDyna() throws Exception {
        Wheels[] wheels = new Wheels[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i]=new Wheels(false,R20D);
        }
        Dyna dyna = new Dyna(new GasTank(15), new Engine(true), new Electrician(true), new Lights(), wheels);
        dyna.setColor("Черный");
        dyna.setMaxSpeed(80);
        dyna.setPriceCar(10_000_000);
        dyna.setTransmission(MECHANICS);
        dyna.StartMoving();
        dyna.UseLight();
        dyna.StopMoving();
        dyna.ChargeFon();
        dyna.setCapacity(320);
        return dyna;
    }

    public Solara CreateSolara() throws Exception {
        Wheels[] wheels = new Wheels[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i]=new Wheels(false,R16);
        }
        Solara solara = new Solara(new GasTank(15), new Engine(true), new Electrician(true), new Lights(), wheels);
        solara.setColor("Синий");
        solara.setMaxSpeed(250);
        solara.setPriceCar(4_000_000);
        solara.setTransmission(ROBOT);
        solara.StartMoving();
        solara.UseLight();
        solara.StopMoving();
        solara.LowerRoof();
        solara.UpperRoof();
        solara.UseFridge();
        return solara;
    }

    public Hiance CreateHiance() throws Exception {
        Wheels[] wheels = new Wheels[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i]=new Wheels(false,R20H);
        }
        Hiance hiance = new Hiance(new GasTank(15), new Engine(true), new Electrician(true), new Lights(), wheels);
        hiance.setColor("Красный");
        hiance.setMaxSpeed(90);
        hiance.setPriceCar(20_000_000);
        hiance.setTransmission(MECHANICS);
        hiance.StartMoving();
        hiance.UseLight();
        hiance.StopMoving();
        hiance.setCapacity(400);
        hiance.getSpareWheel();
        return hiance;
    }
}
