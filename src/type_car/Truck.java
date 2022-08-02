package type_car;

import car_details.*;
import factory_car.Country;
import sales.Directory;

public abstract class Truck extends Car {
    private int capacity;


    public Truck(String color, int maxSpeed, Transmission transmission, boolean inMove,
                 double priceCar, GasTank gasTank, Engine engine, Electrician electrician,
                 Lights lights, Wheels[] wheels, int capacity, Country country, Directory name) {
        super(color, maxSpeed, transmission, inMove, priceCar, gasTank, engine, electrician, lights, wheels,country,name);
        this.capacity = capacity;
    }

    public int getCapacity() {
        System.out.println("Максимальная грузоподъемность "+ capacity);
        return capacity;
    }
}
