package type_car;
import car_details.*;

public abstract class Cabriolet extends Car {
    private boolean roof;

      public Cabriolet(String color, int maxSpeed, Transmission transmission, boolean inMove, double priceCar,
                     GasTank gasTank, Engine engine, Electrician electrician,
                     Lights lights, Wheels[] wheels,boolean isRoof) {
        super(color, maxSpeed, transmission, inMove, priceCar, gasTank, engine, electrician, lights, wheels);
        this.roof=isRoof;
    }
    public void LowerRoof(){
        roof=false;
        System.out.println("Крыша опущена");
    }
    public void UpperRoof(){
        roof=true;
        System.out.println("Крыша поднята");
    }
}
