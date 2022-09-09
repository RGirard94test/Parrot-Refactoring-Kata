package parrot;

public class AfricanParrot extends Parrot {
    public static final double LOAD_FACTOR = 9.0;
    private double numberOfCoconuts;

    public AfricanParrot(double numberOfCoconuts) {
        super();
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }
}
