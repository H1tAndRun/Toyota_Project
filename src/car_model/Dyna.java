package car_model;

import car_details.*;
import factory_car.Country;
import type_car.Truck;

public class Dyna extends Truck {
    private Socket socket;

    public Dyna(String color, int maxSpeed, Transmission transmission, boolean inMove, double priceCar, GasTank gasTank,
                Engine engine, Electrician electrician, Lights lights, Wheels[] wheels, int capacity, Socket socket, Country country) throws Exception {
        super(color, maxSpeed, transmission, inMove, priceCar, gasTank, engine, electrician, lights, wheels, capacity,country);
        this.socket = socket;
        for (Wheels value : wheels) {
            if (value.getRadius().getDiameter() != 20) {
                throw new Exception("Не подходят колеса");
            }
        }
    }
    public Socket getSocket(){
        return socket;
    }
}

