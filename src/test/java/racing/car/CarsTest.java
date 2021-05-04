package racing.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private static final int MIN_MOVE_VALUE = 4;

    @DisplayName("우승자 선정 확인")
    @Test
    void pickOneWinner() {
        //given
        Cars cars = new Cars(Arrays.asList("car1", "car2", "car3"));
        Car car1 = cars.getCars().get(0);

        //when
        car1.run(MIN_MOVE_VALUE);
        List<Car> winner = cars.pickWinners();

        //then
        assertThat(winner).contains(car1);
    }

}
