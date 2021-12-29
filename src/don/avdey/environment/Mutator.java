package don.avdey.environment;

import don.avdey.mutant.Mutant;

public interface Mutator {
    Mutant mutate(Mutant source);
}
