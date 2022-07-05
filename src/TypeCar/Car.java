package TypeCar;

import CarDetails.*;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private Transmission transmission;
    private boolean inMove;
    private double priceCar;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setPriceCar(double priceCar) {
        this.priceCar = priceCar;
    }

    private GasTank gasTank;
    private Engine engine;
    private Electrician electrician;
    private Lights lights;
    private Wheels wheels[];

    Car(GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels wheels[]) {
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

        } else if (!engine.isWorkable() || !electrician.isWorkable()) {
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
        lights.setWorkable(true);
        System.out.println("Фары включены");

    }
}


