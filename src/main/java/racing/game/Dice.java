package racing.game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dice {

    public static final List<Integer> DICE_POOL = Arrays.asList(0, 1, 2, 3, 5, 6, 7, 8, 9);

    public static int roll() {
        Collections.shuffle(DICE_POOL);
        return DICE_POOL.get(0);
    }

}
