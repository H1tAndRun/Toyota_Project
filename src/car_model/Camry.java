package car_model;

import car_details.*;
import factory_car.Country;
import sales.Directory;
import type_car.*;

public class Camry extends PassengerCar {
    private Usb usb;

    public Camry(String color, int maxSpeed, Transmission transmission, boolean inMove, double priceCar, GasTank gasTank,
                 Engine engine, Electrician electrician, Lights lights, Wheels[] wheels, boolean cruiseControl,
                 Usb usb, Country country) throws Exception {
        super(color, maxSpeed, transmission, inMove, priceCar, gasTank,
                engine, electrician, lights, wheels, cruiseControl,country,Directory.CAMRY);
        this.usb = usb;
        for ( Wheels value : wheels) {
            if (value.getRadius().getDiameter()!=17) {
                throw new Exception("Не подходят колеса");
            }
        }
    }

   public Usb getUsb(){
        return usb;
   }

}
