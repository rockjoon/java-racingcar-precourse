package racing;

import racing.car.Cars;
import racing.game.GameCenter;
import racing.io.Input;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Cars cars = input.requestName();
        int repeat = input.requestRepeat();

        GameCenter gameCenter = new GameCenter(cars, repeat);
        gameCenter.play();
    }
}
