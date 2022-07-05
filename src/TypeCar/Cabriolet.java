package TypeCar;


import CarDetails.*;

public abstract class Cabriolet extends Car {
    private boolean roof;

    public void LowerRoof(){
        roof=false;
        System.out.println("Крыша опущена");
    }
    public void UpperRoof(){
        roof=true;
        System.out.println("Крыша поднята");
    }

    protected Cabriolet(GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels wheels[]) {
        super(gasTank, engine, electrician, lights,wheels);
    }

}
