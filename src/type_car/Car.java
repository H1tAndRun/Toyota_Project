package type_car;

import car_details.*;

public abstract class Car {
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

    public Car(String color, int maxSpeed, Transmission transmission, boolean inMove, double priceCar,
               GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels[] wheels) {
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
}


