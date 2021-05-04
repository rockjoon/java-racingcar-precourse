package racing.util;

import java.util.Arrays;
import java.util.List;

public class TypeCastingHelper {

    public static List<String> fromStringToList(String input) {
        return Arrays.asList(input.split(","));
    }
}
