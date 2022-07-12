package factory;

import car_details.*;
import car_model.*;

public class AssemblyLine {
    private Country country;
    private ManufacturingFactory manufacturingFactory;

    public AssemblyLine(Country country, ManufacturingFactory manufacturingFactory) throws Exception {
        this.country = country;
        this.manufacturingFactory = manufacturingFactory;
        if (manufacturingFactory.getCountry()!=country){
            throw new CountryFactoryNoyEqualExeption(exp());
        }
    }
    private String exp(){
        return "Несоответствие страны сборки "+this.country.name()+" ,стране производителю "+manufacturingFactory.getCountry().name();
    }

    public Country getCountry() {
        return country;
    }

    public ManufacturingFactory getManufacturingFactory() {
        return manufacturingFactory;
    }
    public Camry createCamry(String color,double price) throws Exception {
        return new Camry(color,200, Transmission.AKPP,false,price,manufacturingFactory.CreateGasTnk(5),
                manufacturingFactory.CreateEngine(),manufacturingFactory.CreateElectrican(),manufacturingFactory.CreateLights(),
                manufacturingFactory.CreateWheels(false, Radius.R17),false, manufacturingFactory.CreateUsb());
    }
    public Solara createSolara(String color, double price) throws Exception {
        return new Solara(color,150,Transmission.ROBOT,false,price,manufacturingFactory.CreateGasTnk(20),
                manufacturingFactory.CreateEngine(),manufacturingFactory.CreateElectrican(),manufacturingFactory.CreateLights(),
                manufacturingFactory.CreateWheels(false,Radius.R16),true,new MiniFridge());
    }
    public Dyna createDyna(String color, double price) throws Exception {
        return new Dyna(color,100,Transmission.MECHANICS,false,price,manufacturingFactory.CreateGasTnk(10),
                manufacturingFactory.CreateEngine(),manufacturingFactory.CreateElectrican(),manufacturingFactory.CreateLights(),
                manufacturingFactory.CreateWheels(false,Radius.R20D),400, manufacturingFactory.CreateSocket());
    }
    public Hiance createHiance(String color,double price) throws Exception{
        return new Hiance(color,110,Transmission.MECHANICS,false,price,manufacturingFactory.CreateGasTnk(2),
                manufacturingFactory.CreateEngine(),manufacturingFactory.CreateElectrican(),manufacturingFactory.CreateLights(),
                manufacturingFactory.CreateWheels(false,Radius.R20H),370,new Wheels(false,Radius.R20H));
    }
}






