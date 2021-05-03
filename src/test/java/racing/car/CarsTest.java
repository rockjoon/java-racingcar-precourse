package racing.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private static final int MIN_MOVE_VALUE = 4;
    Car car1;
    Car car2;
    Cars cars;

    @BeforeEach
    void setUp() {
        car1 = new Car("car1");
        car2 = new Car("car2");
        cars = new Cars(Arrays.asList(car1, car2));
    }

    @DisplayName("우승자 선정 확인")
    @Test
    void pickOneWinner() {
        //given
        car1.run(MIN_MOVE_VALUE);

        //when
        List<Car> winner = cars.pickWinners();

        //then
        assertThat(winner).contains(car1);
    }

}
