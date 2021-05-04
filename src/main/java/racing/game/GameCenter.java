package racing.game;

import racing.car.Car;
import racing.car.Cars;

import java.util.List;

import static racing.io.ConsoleMessage.RACING_RESULT;
import static racing.io.Output.print;


public class GameCenter {

    private final Cars cars;
    private final int repeat;

    public GameCenter(final Cars cars, final int repeat) {
        this.cars = cars;
        this.repeat = repeat;
    }

    public void play() {
        print(RACING_RESULT);
        for (int i = 0; i < repeat; i++) {
            race();
        }
        List<Car> winners = cars.pickWinners();
        cars.printWinner(winners);
    }

    private void race() {
        for (Car car : cars.getCars()) {
            car.run(Dice.roll());
            car.printResult();
        }
        System.out.println();
    }
}
