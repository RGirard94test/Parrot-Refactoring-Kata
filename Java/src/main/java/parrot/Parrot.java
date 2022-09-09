package parrot;

abstract public class Parrot {
    public static final double MAXIMUM_SPEED_VALUE = 24.0;
    public static final double BASE_SPEED = 12.0;

    public Parrot() {
    }

    public abstract double getSpeed();
}

