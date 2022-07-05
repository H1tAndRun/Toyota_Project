import CarDetails.*;
import TypeCar.Truck;

public class Dyna extends Truck {
    private boolean socket;

    protected Dyna(GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels[] wheels) throws Exception {
        super(gasTank, engine, electrician, lights, wheels);
        for (Wheels value : wheels) {
            if (value.getDiameter() != 20) {
                throw new Exception("Не подходят колеса");
            }
        }
    }

    public void ChargeFon() {
        socket = true;
        System.out.println("Телефон на зрядке");
    }
}
