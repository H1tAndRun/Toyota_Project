package sales;

public enum Directory {
    CAMRY(5000.0),SOLARA(8000.0),HIANCE(10000.0),DYNA(12000.0);
    private double costPrice;

    Directory(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }
}
