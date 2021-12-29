package don.avdey.encounter;

import don.avdey.mutant.Mutant;
import don.avdey.trait.Trait;

public class BadTraitEncounterStrategy implements EncounterStrategy {
    @Override
    public EncounterAction encounter(Mutant mutant) {
        if (mutant.getTrait().equals(Trait.GOOD)) {
            return EncounterAction.BEAT;
        }
        return EncounterAction.FIGHT;
    }
}
