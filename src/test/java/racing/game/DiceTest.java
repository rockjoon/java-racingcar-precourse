package racing.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiceTest {

    @DisplayName("주사위 랜덤 확인값 범위 확인")
    @Test
    void getRandomNumber() {
        for (int i = 0; i < 10; i++) {
            int a = Dice.roll();
            assertThat(Dice.DICE_POOL).contains(a);
        }
    }

}