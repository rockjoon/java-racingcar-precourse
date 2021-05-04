package racing.io;

import racing.car.Cars;
import racing.util.TypeCastingHelper;

import java.util.List;
import java.util.Scanner;

import static racing.io.ConsoleMessage.*;
import static racing.io.Output.print;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public Cars requestName() {
        print(REQUEST_NAMES);
        List<String> names = null;
        Cars cars = null;
        try {
            names = TypeCastingHelper.fromStringToList(scanner.next());
            cars = new Cars(names);
        } catch (Exception e) {
            print(REQUEST_ERROR);
            requestName();
        }
        return cars;
    }

    public int requestRepeat() {
        print(REQUEST_REPEAT);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            print(REQUEST_ERROR);
            return requestRepeat();
        }
    }

}
