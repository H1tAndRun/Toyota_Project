package CarDetails;

public enum Radius {
    CAMRY(17),
    SOLARA(16),
    HIANCE(20),
    DYNA(20);

    private int diameter;

    Radius(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}
