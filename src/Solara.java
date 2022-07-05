import CarDetails.*;
import TypeCar.Cabriolet;


public class Solara extends Cabriolet {
    boolean fridge;

    public Solara(GasTank gasTank, Engine engine, Electrician electrician, Lights lights, Wheels[] wheels) throws Exception {
        super(gasTank, engine, electrician, lights, wheels);
        for (Wheels value : wheels) {
            if (value.getDiameter()!=16){
                throw new Exception("Не подходят колеса");
            }
        }
    }
    public void UseFridge(){
        fridge=true;
        System.out.println("Напиток охлажден");
    }
}
