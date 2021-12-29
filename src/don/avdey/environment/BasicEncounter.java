package don.avdey.environment;

import don.avdey.mutant.Mutant;

public class BasicEncounter implements Encounter {

    private final int rewardUnit;

    public BasicEncounter(int rewardUnit) {
        this.rewardUnit = rewardUnit;
    }

    @Override
    public void encounter(Mutant self, Mutant other) {
        self.getTrait().getEncounterStrategy().encounter(other).doAction(self, other, this.rewardUnit);
    }
}
