package racing.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private static final int MIN_MOVE_VALUE = 4;

    @DisplayName("자동차 객체 유효하게 생성 확인")
    @Test
    void car() {
        //given
        String name = "car1";

        //when
        Car car = new Car(name);

        //then
        assertThat(car.getName().getValue()).isEqualTo(name);
        assertThat(car.getPosition().getValue()).isEqualTo(0);
    }

    @DisplayName("자동차 전진 시 위치값 증가 확인")
    @Test
    void run() {
        //given
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        //when
        car1.run(MIN_MOVE_VALUE);

        //then
        assertThat(car1.getPosition().getValue()).isGreaterThan(car2.getPosition().getValue());
    }
}
