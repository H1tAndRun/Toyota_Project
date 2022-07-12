package factory_car;

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
        return new Camry(color,200, Transmission.AKPP,false,price,manufacturingFactory.сreateGasTnk(5),
                manufacturingFactory.сreateEngine(),manufacturingFactory.сreateElectrican(),manufacturingFactory.сreateLights(),
                manufacturingFactory.сreateWheels(false, Radius.R17),false, manufacturingFactory.сreateUsb(),Country.RUSSIAN);
    }
    public Solara createSolara(String color, double price) throws Exception {
        return new Solara(color,150,Transmission.ROBOT,false,price,manufacturingFactory.сreateGasTnk(20),
                manufacturingFactory.сreateEngine(),manufacturingFactory.сreateElectrican(),manufacturingFactory.сreateLights(),
                manufacturingFactory.сreateWheels(false,Radius.R16),true,new MiniFridge(),Country.GERMANY);
    }
    public Dyna createDyna(String color, double price) throws Exception {
        return new Dyna(color,100,Transmission.MECHANICS,false,price,manufacturingFactory.сreateGasTnk(10),
                manufacturingFactory.сreateEngine(),manufacturingFactory.сreateElectrican(),manufacturingFactory.сreateLights(),
                manufacturingFactory.сreateWheels(false,Radius.R20D),400, manufacturingFactory.сreateSocket(),Country.FRANCE);
    }
    public Hiance createHiance(String color,double price) throws Exception{
        return new Hiance(color,110,Transmission.MECHANICS,false,price,manufacturingFactory.сreateGasTnk(2),
                manufacturingFactory.сreateEngine(),manufacturingFactory.сreateElectrican(),manufacturingFactory.сreateLights(),
                manufacturingFactory.сreateWheels(false,Radius.R20H),370,new Wheels(false,Radius.R20H),Country.USA);
    }
}






