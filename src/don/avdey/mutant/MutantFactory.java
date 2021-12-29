package don.avdey.mutant;

import java.util.List;

public interface MutantFactory {
    Mutant createMutant();

    List<Mutant> createPopulation(int size);
}
