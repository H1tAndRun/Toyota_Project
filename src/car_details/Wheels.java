package car_details;

public class Wheels {
    boolean pierced;
    Radius radius;

    public Wheels(boolean pierced, Radius radius) {
        this.pierced = pierced;
        this.radius = radius;
    }

    public boolean isPierced() {
        return pierced;
    }

    public Radius getRadius() {
        return radius;
    }

}
