package people;

import car_model.Camry;
import car_model.Dyna;
import car_model.Hiance;
import car_model.Solara;
import factory_car.AssemblyLine;
import stock_car.Stock;
import type_car.Car;

import java.util.Arrays;

public class Manager {
    Stock stock;
    AssemblyLine assemblyLine;

    public Manager(Stock stock, AssemblyLine assemblyLine) {
        this.stock = stock;
        this.assemblyLine = assemblyLine;
    }

    public Car sellACar(Buyer buyer) throws Exception {
        if(stock.getCountCar()<=0){
            if(buyer.getMaxMoney()>=22000){
                System.out.println("К сожалению машины нет в наличии, поэтому мы закажем для вас новую Dyna");
                stock.addCarDyna(assemblyLine.createDyna("black",22000));
            }else if(buyer.getMaxMoney()>=15000){
                System.out.println("К сожалению машины нет в наличии, поэтому мы закажем для вас новую Hiance");
                stock.addCarHiance(assemblyLine.createHiance("black",15000));
            }else if(buyer.getMaxMoney()>=12000){
                System.out.println("К сожалению машины нет в наличии, поэтому мы закажем для вас новую Solara");
                stock.addCarSolara(assemblyLine.createSolara("white",12000));
            }else if(buyer.getMaxMoney()>=10000){
                System.out.println("К сожалению машины нет в наличии, поэтому мы закажем для вас новую Camry");
                stock.addCarCamry(assemblyLine.createCamry("white",10000));
            }
        }
        Car maxPriceCar=null;
        int count = 0;
        double res=0;

        Dyna[] dyna = stock.getDynaArr();
        Hiance[] hiance = stock.getHianceArr();
        Camry[] camry = stock.getCamryArr();
        Solara[] solara = stock.getSolaraArr();

        for (int i = 0; i < dyna.length; i++) {
            if(dyna[i]==null){
                continue;
            }
            if(buyer.getMaxMoney()>=dyna[i].getPriceCar()&&dyna[i].getPriceCar()> res){
                maxPriceCar=dyna[i];
                count=i;
                res=dyna[i].getPriceCar();
            }
        }

        for (int i = 0; i < hiance.length; i++) {
            if(hiance[i]==null){
                continue;
            }
            if(buyer.getMaxMoney()>=hiance[i].getPriceCar()&&hiance[i].getPriceCar()> res){
                maxPriceCar=hiance[i];
                count=i;
                res=hiance[i].getPriceCar();
            }
        }

        for (int i = 0; i < camry.length; i++) {
            if(camry[i]==null){
                continue;
            }
            if(buyer.getMaxMoney()>=camry[i].getPriceCar()&&camry[i].getPriceCar()> res){
                maxPriceCar=camry[i];
                count=i;
                res=camry[i].getPriceCar();
            }
        }

        for (int i = 0; i < solara.length; i++) {
            if(solara[i]==null){
                continue;
            }
            if(buyer.getMaxMoney()>=solara[i].getPriceCar()&&solara[i].getPriceCar()> res){
                maxPriceCar=solara[i];
                count=i;
                res=solara[i].getPriceCar();
            }
        }

        if (maxPriceCar instanceof Dyna){
            dyna[count]=null;
            Dyna dyna1[]=Arrays.copyOf(dyna,count);
            Dyna dyna2[]=Arrays.copyOfRange(dyna,count+1,dyna.length);
            for (int i = 0; i < dyna1.length; i++) {
                dyna[i]=dyna1[i];
            }
            for (int i = 0; i < dyna2.length; i++) {
                dyna[dyna1.length+i]=dyna2[i];
            }
            stock.setCountCar(stock.getCountCar()-1);
            stock.setCountDyna(stock.getCountDyna()-1);
            stock.setMaxCountCar(stock.getMaxCountCar()+1);
        }else if(maxPriceCar instanceof Hiance){
            hiance[count]=null;
            Hiance hiance1[]=Arrays.copyOf(hiance,count);
            Hiance hiance2[]=Arrays.copyOfRange(hiance,count+1,hiance.length);
            for (int i = 0; i < hiance1.length; i++) {
                hiance[i]=hiance1[i];
            }
            for (int i = 0; i < hiance2.length; i++) {
                hiance[hiance1.length+i]=hiance2[i];
            }
            stock.setCountCar(stock.getCountCar()-1);
            stock.setCountHiance(stock.getCountHiance()-1);
            stock.setMaxCountCar(stock.getMaxCountCar()+1);
        }else if(maxPriceCar instanceof Camry){
            camry[count]=null;
            Camry camry1[]=Arrays.copyOf(camry,count);
            Camry camry2[]=Arrays.copyOfRange(camry,count+1,camry.length+1);
            for (int i = 0; i < camry1.length; i++) {
                camry[i]=camry1[i];
            }
            for (int i = 0; i < camry.length; i++) {
                camry[camry1.length+i]=camry2[i];
            }
            stock.setCountCar(stock.getCountCar()-1);
            stock.setCountCamry(stock.getCountCamry()-1);
            stock.setMaxCountCar(stock.getMaxCountCar()+1);
        }else if(maxPriceCar instanceof Solara){
            solara[count]=null;
            Solara solara1[]=Arrays.copyOf(solara,count);
            Solara solara2[]=Arrays.copyOfRange(solara,count+1,solara.length);
            for (int i = 0; i < solara1.length; i++) {
                solara[i]=solara1[i];
            }
            for (int i = 0; i < solara2.length; i++) {
                solara[solara1.length+i]=solara2[i];
            }
            stock.setCountCar(stock.getCountCar()-1);
            stock.setCountSolara(stock.getCountSolara()-1);
            stock.setMaxCountCar(stock.getMaxCountCar()+1);
        }

        if (maxPriceCar==null){
            System.out.println("К сожалению у вас не хватает денег +\n");
            return null;
        }
        buyer.setMaxMoney(buyer.getMaxMoney()-maxPriceCar.getPriceCar());
        System.out.println("Покупателю "+buyer.getName()+" cоветую приобрести машину "+maxPriceCar.getClass() + " за "+maxPriceCar.getPriceCar()+"\n");
        return maxPriceCar;
    }

}
