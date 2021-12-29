package don.avdey.trait;

import don.avdey.mutant.Mutant;
import don.avdey.encounter.BadTraitEncounterStrategy;
import don.avdey.encounter.EncounterStrategy;
import don.avdey.encounter.GoodTraitEncounterStrategy;
import don.avdey.encounter.UglyTraitEncounterStrategy;

public enum Trait {
    GOOD(new GoodTraitEncounterStrategy()),
    BAD(new BadTraitEncounterStrategy()),
    UGLY(new UglyTraitEncounterStrategy());

    private final EncounterStrategy encounterStrategy;

    Trait(EncounterStrategy encounterStrategy) {
        this.encounterStrategy = encounterStrategy;
    }

    public EncounterStrategy getEncounterStrategy() {
        return encounterStrategy;
    }

    public static Trait determineDominantTrait(Mutant mutant) {
        if (mutant.getGoodness() > mutant.getBadness() && mutant.getGoodness() > mutant.getUgliness()) {
            return Trait.GOOD;
        } else if (mutant.getBadness() > mutant.getGoodness() && mutant.getBadness() > mutant.getUgliness()) {
            return Trait.BAD;
        }
        return Trait.UGLY;
    }
}
