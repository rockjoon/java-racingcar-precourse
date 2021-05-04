package racing.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

}
