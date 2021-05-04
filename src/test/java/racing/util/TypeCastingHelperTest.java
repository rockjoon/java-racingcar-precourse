package racing.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TypeCastingHelperTest {

    @DisplayName("주어진 이름을 ,을 기준으로 구분하여 리스트로 반환")
    @Test
    void stringToList() {
        //given
        String names = "abc1,가나다,123";

        //when
        List<String> result = TypeCastingHelper.fromStringToList(names);

        //then
        assertThat(result.size()).isEqualTo(3);
        assertThat(result).contains("abc1");
    }
}