package car_model;

import car_details.*;
import type_car.Cabriolet;


public class Solara extends Cabriolet {
    private MiniFridge miniFridge;

    public Solara(String color, int maxSpeed, Transmission transmission, boolean inMove, double priceCar,
                  GasTank gasTank, Engine engine, Electrician electrician, Lights lights,
                  Wheels[] wheels, boolean isRoof, MiniFridge miniFridge) throws Exception {
        super(color, maxSpeed, transmission, inMove, priceCar, gasTank, engine, electrician, lights, wheels, isRoof);
        this.miniFridge = miniFridge;
        for (Wheels value : wheels) {
            if (value.getRadius().getDiameter() != 16) {
                throw new Exception("Не подходят колеса");
            }
        }
    }

    public MiniFridge getMiniFridge() {
        return miniFridge;
    }
}
