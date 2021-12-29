package don.avdey.environment;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Dice {
    public static final Dice INSTANCE = new Dice();

    private static final Random RANDOM = new Random();

    private Dice() {

    }

    public int rollForInt(int d) {
        return RANDOM.nextInt(d + 1);
    }

    public float rollForFloat() {
        return RANDOM.nextFloat();
    }

    public double rollForSurvival() {
        return 0.35;
    }

    public Set<Integer> rollForIndices(int size, int max, int exclude) {
        Set<Integer> indices = new HashSet<>(size);
        while (indices.size() != size) {
            int index = RANDOM.nextInt(max);
            if (exclude != index) {
                indices.add(index);
            }
        }
        return indices;
    }

}
