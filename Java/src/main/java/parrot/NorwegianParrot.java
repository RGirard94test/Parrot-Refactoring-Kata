package parrot;

public class NorwegianParrot extends Parrot {
    private final boolean isNailed;
    private final double voltage;

    public NorwegianParrot(double voltage, boolean isNailed) {
        super();
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getNorwegianParrotBaseSpeed(voltage);
    }

    private double getNorwegianParrotBaseSpeed(double voltage) {
        return Math.min(MAXIMUM_SPEED_VALUE, voltage * BASE_SPEED);
    }
}
