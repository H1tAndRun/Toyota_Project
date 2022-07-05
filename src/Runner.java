import CarDetails.*;

public class Runner {
    Wheels wheels[] = new Wheels[4];

    public static void main(String[] args) throws Exception {
        Runner runner = new Runner();
        runner.CreateCamry();
        System.out.println();
        runner.CreateSolara();
        System.out.println();
        runner.CreateDyna();
        System.out.println();
        runner.CreateHiance();
    }

    public Camry CreateCamry() throws Exception {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = Wheels.CAMRY;
        }
        Camry camry = new Camry(new GasTank(5), new Engine(true), new Electrician(true), new Lights(), wheels);
        camry.setColor("Белый");
        camry.setMaxSpeed(250);
        camry.setPriceCar(1_000_000);
        camry.setTransmission(Transmission.AKPP);
        camry.StartMoving();
        camry.UseLight();
        camry.StopMoving();
        camry.UseCruiseControl(true);
        camry.Music();
        return camry;
    }

    public Dyna CreateDyna() throws Exception {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = Wheels.DYNA;
        }
        Dyna dyna = new Dyna(new GasTank(15), new Engine(true), new Electrician(true), new Lights(), wheels);
        dyna.setColor("Черный");
        dyna.setMaxSpeed(80);
        dyna.setPriceCar(10_000_000);
        dyna.setTransmission(Transmission.MECHANICS);
        dyna.StartMoving();
        dyna.UseLight();
        dyna.StopMoving();
        dyna.ChargeFon();
        dyna.setCapacity(320);
        return dyna;
    }

    public Solara CreateSolara() throws Exception {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = Wheels.SOLARA;
        }
        Solara solara = new Solara(new GasTank(15), new Engine(true), new Electrician(true), new Lights(), wheels);
        solara.setColor("Синий");
        solara.setMaxSpeed(250);
        solara.setPriceCar(4_000_000);
        solara.setTransmission(Transmission.MECHANICS);
        solara.StartMoving();
        solara.UseLight();
        solara.StopMoving();
        solara.LowerRoof();
        solara.UpperRoof();
        solara.UseFridge();
        return solara;
    }

    public Hiance CreateHiance() throws Exception {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = Wheels.HIANCE;
        }
        Hiance hiance = new Hiance(new GasTank(15), new Engine(true), new Electrician(true), new Lights(), wheels);
        hiance.setColor("Красный");
        hiance.setMaxSpeed(90);
        hiance.setPriceCar(20_000_000);
        hiance.setTransmission(Transmission.MECHANICS);
        hiance.StartMoving();
        hiance.UseLight();
        hiance.StopMoving();
        hiance.setCapacity(400);
        hiance.getSpareWheel();
        return hiance;
    }


}
