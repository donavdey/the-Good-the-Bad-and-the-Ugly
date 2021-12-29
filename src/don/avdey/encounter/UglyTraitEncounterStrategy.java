package don.avdey.encounter;

import don.avdey.mutant.Mutant;
import don.avdey.trait.Trait;

public class UglyTraitEncounterStrategy implements EncounterStrategy {
    @Override
    public EncounterAction encounter(Mutant mutant) {
        if (mutant.getTrait().equals(Trait.GOOD)) {
            return EncounterAction.COOPERATE;
        } else if (mutant.getTrait().equals(Trait.BAD)) {
            return EncounterAction.FIGHT;
        }
        return EncounterAction.IGNORE;
    }
}
