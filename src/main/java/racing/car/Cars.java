package racing.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static racing.io.ConsoleMessage.RACING_WINNERS;
import static racing.io.Output.print;

public class Cars {

    private final List<Car> cars;

    public Cars(List<String> carNames) {
        this.cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> pickWinners() {
        ArrayList<Car> winners = new ArrayList<>();
        Position max = getMaxPosition();
        for (Car car : cars) {
            addToListIfWinner(winners, car, max);
        }
        return winners;
    }

    private Position getMaxPosition() {
        List<Position> positionList = new ArrayList<>();
        for (Car car : cars) {
            positionList.add(car.getPosition());
        }
        return Collections.max(positionList);
    }

    private void addToListIfWinner(ArrayList<Car> winners, Car car, Position max) {
        if (car.getPosition().equals(max)) {
            winners.add(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void printWinner(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < winners.size(); i++) {
            appendWinner(sb, winners.get(i), i, winners.size());
        }
        sb.append(RACING_WINNERS.message());
        print(sb.toString());
    }

    private void appendWinner(StringBuilder sb, Car winner, int index, int size) {
        if (size - 1 == index) {
            sb.append(winner.getName().getValue());
            return;
        }
        sb.append(winner.getName().getValue()).append(", ");
    }
}
