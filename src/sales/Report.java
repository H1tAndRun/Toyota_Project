package sales;

import type_car.Car;

import java.util.ArrayList;

public class Report {
    private String nameManager;
    private ArrayList<Car>salesList=new ArrayList<>();

    public Report(String nameManager) {
        this.nameManager = nameManager;
    }

    public String getNameManager() {
        return nameManager;
    }

    public ArrayList<Car> getSalesList() {
        return salesList;
    }
    public void addCar(Car car){
        salesList.add(car);
    }
}
