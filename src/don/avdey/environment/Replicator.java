package don.avdey.environment;

import don.avdey.mutant.Mutant;

import java.util.List;

public interface Replicator {
    List<Mutant> replicate(Mutant source);
}
