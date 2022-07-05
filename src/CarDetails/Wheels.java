package CarDetails;

public enum Wheels {
    CAMRY(false, 17),
    SOLARA(false, 16),
    HIANCE(false, 20),
    DYNA(false, 20);

    private boolean pierced;
    int diameter;

    Wheels(boolean pierced, int diameter) {
        this.pierced = pierced;
        this.diameter = diameter;
    }

    public boolean isPierced() {
        return pierced;
    }

    public int getDiameter() {
        return diameter;
    }
}
