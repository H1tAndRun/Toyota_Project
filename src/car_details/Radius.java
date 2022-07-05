package car_details;

public enum Radius {
    R17(17),
    R16(16),
    R20H(20),
    R20D(20);

    private int diameter;

    Radius(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}
