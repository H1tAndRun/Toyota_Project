package type_car;

import car_details.*;

public abstract class Truck extends Car {
    private int capacity;


    public Truck(String color, int maxSpeed, Transmission transmission, boolean inMove,
                 double priceCar, GasTank gasTank, Engine engine, Electrician electrician,
                 Lights lights, Wheels[] wheels, int capacity) {
        super(color, maxSpeed, transmission, inMove, priceCar, gasTank, engine, electrician, lights, wheels);
        this.capacity = capacity;
    }

    public int getCapacity() {
        System.out.println("Максимальная грузоподъемность "+ capacity);
        return capacity;
    }
}
