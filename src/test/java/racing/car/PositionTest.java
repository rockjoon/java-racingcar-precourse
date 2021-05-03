package racing.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @DisplayName("시작위치/지정위치 부여 확인")
    @Test
    void position() {
        //given
        int value = 3;

        //when
        Position startPosition = Position.valueOfStart();
        Position position = Position.valueOf(value);

        //then
        assertThat(startPosition.getValue()).isEqualTo(0);
        assertThat(position.getValue()).isEqualTo(value);
    }

    @DisplayName("add()함수 호출 시 위치 증가 확인")
    @Test
    void add() {
        //given
        Position start = Position.valueOfStart();

        //when
        Position moved = start.add();

        //then
        assertThat(start.getValue()).isLessThan(moved.getValue());
    }
}
