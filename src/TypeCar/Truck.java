package TypeCar;

import CarDetails.*;

 public abstract class Truck extends Car {
    int capacity;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        System.out.println("Грузоподъемность "+capacity +" кг");
    }

    protected Truck(GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels wheels[]) {
        super(gasTank, engine, electrician, lights,wheels);
    }

}
