package racing.car;

import java.util.Objects;

public class Position implements Comparable{

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Object o) {
        Position another = (Position) o;
        if (this.value > another.getValue()) {
            return 1;
        }
        if (this.value < another.getValue()) {
            return -1;
        }
        return 0;
    }
}
