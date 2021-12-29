package don.avdey.environment;

import don.avdey.mutant.Mutant;

public class BasicMutator implements Mutator {

    private final float mutationFactor;

    public BasicMutator(float mutationFactor) {
        this.mutationFactor = mutationFactor;
    }

    @Override
    public Mutant mutate(Mutant source) {
        Mutant result = new Mutant();
        result.setGoodness(Dice.INSTANCE.rollForFloat() < this.mutationFactor ? Dice.INSTANCE.rollForInt(11) : source.getGoodness());
        result.setBadness(Dice.INSTANCE.rollForFloat() < this.mutationFactor ? Dice.INSTANCE.rollForInt(11) : source.getBadness());
        result.setUgliness(Dice.INSTANCE.rollForFloat() < this.mutationFactor ? Dice.INSTANCE.rollForInt(11) : source.getUgliness());
        return result;
    }
}
