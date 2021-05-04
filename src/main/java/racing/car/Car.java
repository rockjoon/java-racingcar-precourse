package racing.car;

import static racing.io.ConsoleMessage.SCORE_SEPARATOR;
import static racing.io.Output.print;
import static racing.io.ConsoleMessage.RACING_DISTANCE;

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

    public void printResult() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.getValue()).append(SCORE_SEPARATOR.message());
        for (int i = 0; i < position.getValue(); i++) {
            sb.append(RACING_DISTANCE.message());
        }
        print(sb.toString());
    }
}
