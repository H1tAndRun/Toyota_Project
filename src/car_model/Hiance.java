package car_model;

import car_details.*;
import factory_car.Country;
import type_car.Truck;

public  class Hiance extends Truck {
   private Wheels safeWheel;

    public Hiance(String color, int maxSpeed, Transmission transmission, boolean inMove, double priceCar,
                  GasTank gasTank, Engine engine, Electrician electrician, Lights lights,
                  Wheels[] wheels, int capacity, Wheels spareWheel, Country country) throws Exception {
        super(color, maxSpeed, transmission, inMove, priceCar, gasTank, engine, electrician, lights, wheels, capacity,country);
        this.safeWheel = spareWheel;
        for (Wheels value : wheels) {
            if (value.getRadius().getDiameter()!=20){
                throw new Exception("Не подходят колеса");
            }
        }
    }

    public Wheels getSafeWheel() {
        return safeWheel;
    }
}
