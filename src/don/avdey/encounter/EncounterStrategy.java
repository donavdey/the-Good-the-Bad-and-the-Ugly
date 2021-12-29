package don.avdey.encounter;

import don.avdey.mutant.Mutant;

public interface EncounterStrategy {
    EncounterAction encounter(Mutant mutant);
}
