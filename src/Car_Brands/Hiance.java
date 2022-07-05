package Car_Brands;

import CarDetails.*;
import TypeCar.Truck;

public  class Hiance extends Truck {
   private Wheels spareWheel=new Wheels(false,Radius.HIANCE);

    public Hiance(GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels wheels[]) throws Exception {
        super(gasTank, engine, electrician, lights,wheels);
        for (Wheels value : wheels) {
            if (value.getRadius().getDiameter()!=20){
                throw new Exception("Не подходят колеса");
            }
        }
    }

    public void getSpareWheel() {
        System.out.println("Есть запасное колесо диаметром "+spareWheel.getRadius().getDiameter());
    }
}
