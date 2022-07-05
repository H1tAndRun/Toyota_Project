import car_details.*;
import car_model.Camry;
import static car_details.Radius.*;
import static car_details.Transmission.*;

public class Runner {
    public static void main(String[] args) throws Exception {
        GasTank gasTank = new GasTank(5);
        Engine engine = new Engine(true);
        Electrician electrics = new Electrician(true);
        Lights lights = new Lights(true);
        Camry camry =new Camry("Black",200,AKPP,false,100000,gasTank,engine,electrics,
                lights,createWheelsWithRadius(false,R17),false,new Usb());
    }


    private static Wheels[] createWheelsWithRadius(boolean piersed,Radius radius){
        Wheels [] wheels=new Wheels[4];
        for (int i = 0; i <wheels.length ; i++) {
            wheels[i]=new Wheels(piersed,radius);
        }
        return wheels;
    }
}
