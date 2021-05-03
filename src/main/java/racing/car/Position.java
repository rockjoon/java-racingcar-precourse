package racing.car;

public class Position {

    private static final int START_POSITION = 0;
    private static final int MOVING_DISTANCE = 1;
    private final int value;

    private Position(final int value) {
        this.value = value;
    }

    public static Position valueOf(final int value) {
        return new Position(value);
    }

    public static Position valueOfStart() {
        return new Position(START_POSITION);
    }

    public Position add() {
        return new Position(value + MOVING_DISTANCE);
    }

    public int getValue() {
        return value;
    }
}
