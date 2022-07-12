package factory;

import car_details.*;

public class ManufacturingFactory {
   private Country country;

    public ManufacturingFactory(Country country) {
        this.country = country;
    }

    protected GasTank CreateGasTnk(int count){
        return new GasTank(count);
    }

    protected Engine CreateEngine(){
        return new Engine(false);
    }
    protected Lights CreateLights(){
        return new Lights(false);
    }
    protected Electrician CreateElectrican(){
        return new Electrician(false);
    }
    protected MiniFridge CreateMiniFridge(){
        return new MiniFridge();
    }
   protected Socket CreateSocket(){
        return new Socket();
    }
    protected Usb CreateUsb(){
        return new Usb();
    }
    protected Wheels[] CreateWheels(boolean isBroken,Radius radius){
        Wheels[]wheels=new Wheels[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i]=new Wheels(false,radius);
        }
        return wheels;
    }

    protected Country getCountry() {
        return country;
    }
}
