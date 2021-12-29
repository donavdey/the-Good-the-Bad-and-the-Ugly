package don.avdey.encounter;

import don.avdey.mutant.Mutant;
import don.avdey.trait.Trait;

public class GoodTraitEncounterStrategy implements EncounterStrategy {
    @Override
    public EncounterAction encounter(Mutant mutant) {
        if (mutant.getTrait().equals(Trait.BAD)) {
            return EncounterAction.SURRENDER;
        }
        return EncounterAction.COOPERATE;
    }
}
