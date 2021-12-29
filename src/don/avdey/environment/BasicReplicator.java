package don.avdey.environment;

import don.avdey.mutant.Mutant;

import java.util.ArrayList;
import java.util.List;

public class BasicReplicator implements Replicator {

    private final int reproductionNumber;

    public BasicReplicator(int reproductionFactor) {
        this.reproductionNumber = reproductionFactor;
    }

    @Override
    public List<Mutant> replicate(Mutant source) {
        List<Mutant> mutants = new ArrayList<>(reproductionNumber);
        for (int i = 0; i < this.reproductionNumber; i++) {
            mutants.add(source);
        }
        return mutants;
    }
}
