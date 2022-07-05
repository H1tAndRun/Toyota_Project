package TypeCar;

import CarDetails.*;

public abstract class PassengerCar extends Car {
    boolean CruiseControl;

    public void UseCruiseControl(boolean cruiseControl) {
        this.CruiseControl = cruiseControl;
        if (cruiseControl) {
            System.out.println("Круиз котроль включен");
        } else {
            System.out.println("Круиз контроль выключен");
        }
    }

    protected PassengerCar(GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels[] wheels) {
        super(gasTank, engine, electrician, lights, wheels);
    }
}
