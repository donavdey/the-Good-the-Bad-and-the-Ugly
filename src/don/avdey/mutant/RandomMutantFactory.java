package don.avdey.mutant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMutantFactory implements MutantFactory {
    private static final Random RANDOM = new Random();

    public Mutant createMutant() {
        Mutant mutant = new Mutant();
        mutant.setBadness(RANDOM.nextInt(11));
        mutant.setGoodness(RANDOM.nextInt(11));
        mutant.setUgliness(RANDOM.nextInt(11));
        return mutant;
    }

    public List<Mutant> createPopulation(int size) {
        List<Mutant> population = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            population.add(this.createMutant());
        }
        return population;
    }
}
