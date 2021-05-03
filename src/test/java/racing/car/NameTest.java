package racing.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

public class NameTest {

    @DisplayName("유효하지 않은 이름 입력 시 익셉션 발생")
    @ParameterizedTest
    @ValueSource(strings = {"123456", "", "asdfgh", "가나다라마바사"})
    void invalidName(String value) {
        assertThatThrownBy(() -> {
            new Name(value);
        });
    }

    @DisplayName("유효한 자동차 이름 생성 확인")
    @Test
    void validName() {
        //given
        String value = "name1";

        //when
        Name name = new Name(value);

        //then
        assertThat(name.getValue()).isEqualTo(value);
    }
}
