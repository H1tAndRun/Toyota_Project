package car_details;

public class Wheels {
    boolean isBroken;
    Radius radius;

    public Wheels(boolean pierced, Radius radius) {
        this.isBroken = pierced;
        this.radius = radius;
    }

    public boolean isPierced() {
        return isBroken;
    }

    public Radius getRadius() {
        return radius;
    }

}
