package parrot;

public class Parrot {

    public static final double MAXIMUM_SPEED_VALUE = 24.0;
    public static final double LOAD_FACTOR = 9.0;
    public static final double BASE_SPEED = 12.0;

    private String type;
    private int numberOfCoconuts;


    public Parrot(String type, int numberOfCoconuts) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        switch (type) {
            case "EUROPEAN":
                return BASE_SPEED;
            case "AFRICAN":
                return getAfricanParrotSpeed();
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }



    private double getAfricanParrotSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

}

