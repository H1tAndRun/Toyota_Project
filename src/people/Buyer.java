package people;

public class Buyer {
   private double maxMoney;
   private String name;

    public Buyer(double maxMoney, String name) {
        this.maxMoney = maxMoney;
        this.name = name;
    }

    public double getMaxMoney() {
        return maxMoney;
    }

    public String getName() {
        return name;
    }

    public void setMaxMoney(double maxMoney) {
        this.maxMoney = maxMoney;
    }
}
