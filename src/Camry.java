import CarDetails.*;
import TypeCar.*;

public class Camry extends PassengerCar {
    private boolean usb;


    public Camry(GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels wheels[]) throws Exception {
        super(gasTank, engine, electrician, lights, wheels);
        for (Wheels value : wheels) {
            if (value.getDiameter() != 17) {
                throw new Exception("Не подходят колеса");
            }
        }
    }

    public void Music() {
        usb = true;
        System.out.println("Музыка включена");
    }

}
