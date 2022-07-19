package people;

import type_car.Car;

public class CashIer {
    private static double totalSum=0;
    public static void addToSum(Car car){
        if (car==null){
            return;
        }
        totalSum+=car.getPriceCar();
    }
    public static double getToSum(){
        System.out.println("Суммка всех проданных машин составляет "+ totalSum);
        return totalSum;
    }
}
