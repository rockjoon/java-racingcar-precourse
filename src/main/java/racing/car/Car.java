package racing.car;

public class Car {

    public static final int MIN_MOVE_VALUE = 4;
    private final Name name;
    private Position position;

    public Car(final String name) {
        this.name = new Name(name);
        this.position = Position.valueOfStart();
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void run(int random) {
        if (random >= MIN_MOVE_VALUE) {
            position = position.add();
        }
    }
}
