package stock_car;

import car_model.*;

import java.util.Arrays;

public class Stock {
    private int countCar = 0;
    private int maxCountCar = 1000;

    private int countCamry = 0;
    private int countSolara = 0;
    private int countHiance = 0;
    private int countDyna = 0;

    private Camry[] camryArr = new Camry[10];
    private Solara[] solaraArr = new Solara[10];
    private Dyna[] dynaArr = new Dyna[10];
    private Hiance[] hianceArr = new Hiance[10];

    public void addCarCamry(Camry camry) {
        if (countCamry >= camryArr.length){
            camryArr= Arrays.copyOf(camryArr,(int) (camryArr.length*1.5));
            camryArr[countCamry]=camry;
            countCamry++;
            countCar++;
            maxCountCar--;
        }else {
            camryArr[countCamry] = camry;
            countCamry++;
            countCar++;
            maxCountCar--;
        }
    }

    public void addCarSolara(Solara solara) {
        if (countSolara >= solaraArr.length){
            solaraArr= Arrays.copyOf(solaraArr,(int) (solaraArr.length*1.5));
            solaraArr[countSolara]=solara;
            countSolara++;
            countCar++;
            maxCountCar--;
        }else {
            solaraArr[countSolara] = solara;
            countSolara++;
            countCar++;
            maxCountCar--;
        }
    }

    void addCarHiance(Hiance hiance) {
        if (countHiance >= hianceArr.length){
            hianceArr= Arrays.copyOf(hianceArr,(int) (hianceArr.length*1.5));
            hianceArr[countHiance]=hiance;
            countHiance++;
            countCar++;
            maxCountCar--;
        }else {
            hianceArr[countHiance] = hiance;
            countHiance++;
            countCar++;
            maxCountCar--;
        }
    }

    void addCarDyna(Dyna dyna) {
        if (countDyna >= dynaArr.length){
            dynaArr= Arrays.copyOf(dynaArr,(int) (dynaArr.length*1.5));
            dynaArr[countDyna]=dyna;
            countDyna++;
            countCar++;
            maxCountCar--;
        }else {
            dynaArr[countDyna] = dyna;
            countDyna++;
            countCar++;
            maxCountCar--;
        }
    }

    public Camry getCamry(){
        Camry getCamry=camryArr[countCamry-1];
        countCamry--;
        maxCountCar++;
        countCar--;
        camryArr=Arrays.copyOf(camryArr,countCamry);
        return getCamry;
    }
    public Solara getSolara(){
        Solara getSolara=solaraArr[countSolara-1];
        countSolara--;
        maxCountCar++;
        countCar--;
        solaraArr=Arrays.copyOf(solaraArr,countSolara);
        return getSolara;
    }
    public Hiance getHiance(){
        Hiance getHiance=hianceArr[countHiance-1];
        countHiance--;
        maxCountCar++;
        countCar--;
        hianceArr=Arrays.copyOf(hianceArr,countHiance);
        return getHiance;
    }
    public Dyna getDyna(){
        Dyna getDyna=dynaArr[countDyna-1];
        countDyna--;
        maxCountCar++;
        countCar--;
        dynaArr=Arrays.copyOf(dynaArr,countDyna);
        return getDyna;
    }

    public int getCountCar() {
        System.out.println("Общее колличество машин на скаледе "+countCar);
        return countCar;
    }

    public int getMaxCountCar() {
        System.out.println("Склад может вместить еще "+maxCountCar+" машин");
        return maxCountCar;
    }

    public int getCountCamry() {
        System.out.println("На складе "+countCamry+" машин Camry");
        return countCamry;
    }

    public int getCountSolara() {
        System.out.println("На складе "+countSolara+" машин Solara");
        return countSolara;
    }

    public int getCountHiance() {
        System.out.println("На складе "+countHiance+" машин Hiance");
        return countHiance;
    }

    public int getCountDyna() {
        System.out.println("На складе "+countDyna+" машин Dyna");
        return countDyna;
    }

    public Camry[] getCamryArr() {
        return camryArr;
    }

    public Solara[] getSolaraArr() {
        return solaraArr;
    }

    public Dyna[] getDynaArr() {
        return dynaArr;
    }

    public Hiance[] getHianceArr() {
        return hianceArr;
    }
}
