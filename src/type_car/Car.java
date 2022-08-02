package type_car;

import car_details.*;
import factory_car.Country;
import sales.Directory;

import java.util.Arrays;

public abstract class Car {
    private Directory name;
    private String color;
    private int maxSpeed;
    private Transmission transmission;
    private boolean inMove;
    private double priceCar;

    private GasTank gasTank;
    private Engine engine;
    private Electrician electrician;
    private Lights lights;
    private Wheels wheels[];
    private Country country;

    public Car(String color, int maxSpeed, Transmission transmission, boolean inMove, double priceCar,
               GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels[] wheels,Country country,Directory name) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.inMove = inMove;
        this.priceCar = priceCar;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electrician = electrician;
        this.lights = lights;
        this.wheels = wheels;
        this.country=country;
        this.name=name;
    }

    public void StartMoving() throws StartExeption {
        for (Wheels wheel : wheels) {
            if (wheel.isPierced()) {
                throw new StartExeption("Начать движение не возможно одно из колес проколото");
            }
        }
        if (wheels.length != 4) {
            throw new StartExeption("Не корректное кол-во колес");
        } else if (gasTank.getAmount() <= 0) {
            throw new StartExeption("Бензобак пустой");

        } else if (engine.isBroken() || electrician.isBroken()) {
            throw new StartExeption("Движение не возможно не работает электрика или двигатель");
        } else {
            inMove = true;
            System.out.println("Машина начала движение");
        }
    }

    public void StopMoving() {
        inMove = false;
        System.out.println("Машина остановилась");
    }

    public void UseLight() {
        if (!lights.isBroken()) {
            System.out.println("Фары включены");
        }else {
            System.out.println("Фары сломаны");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", transmission=" + transmission +
                ", inMove=" + inMove +
                ", priceCar=" + priceCar +
                ", gasTank=" + gasTank +
                ", engine=" + engine +
                ", electrician=" + electrician +
                ", lights=" + lights +
                ", wheels=" + Arrays.toString(wheels) +
                ", country=" + country +
                '}';
    }

    public Directory getName() {
        return name;
    }

    public double getPriceCar() {
        return priceCar;
    }
}


