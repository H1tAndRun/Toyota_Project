package factory;

import car_details.*;

public class ManufacturingFactory {
   private Country country;

    public ManufacturingFactory(Country country) {
        this.country = country;
    }

    public GasTank сreateGasTnk(int count){
        return new GasTank(count);
    }

    public Engine сreateEngine(){
        return new Engine(false);
    }
    public Lights сreateLights(){
        return new Lights(false);
    }
    public Electrician сreateElectrican(){
        return new Electrician(false);
    }
    public MiniFridge CreateMiniFridge(){
        return new MiniFridge();
    }
    public Socket сreateSocket(){
        return new Socket();
    }
    public Usb сreateUsb(){
        return new Usb();
    }
    public Wheels[] сreateWheels(boolean isBroken,Radius radius){
        Wheels[]wheels=new Wheels[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i]=new Wheels(false,radius);
        }
        return wheels;
    }

    public Country getCountry() {
        return country;
    }
}
