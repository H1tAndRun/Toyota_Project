package type_car;

import car_details.*;

public abstract class PassengerCar extends Car {
    private boolean cruiseControl;

    public PassengerCar(String color, int maxSpeed, Transmission transmission, boolean inMove,
                        double priceCar, GasTank gasTank, Engine engine, Electrician electrician,
                        Lights lights, Wheels[] wheels, boolean cruiseControl) {
        super(color, maxSpeed, transmission, inMove, priceCar, gasTank, engine, electrician, lights, wheels);
        this.cruiseControl = cruiseControl;
    }

    public void changeCruiseControl(){
        this.cruiseControl=!this.cruiseControl;
        if (cruiseControl){
            System.out.println("Круиз контроль включен");
        }else {
            System.out.println("Круиз контроль выключен");
        }
    }


}
