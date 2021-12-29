package don.avdey.mutant;

import don.avdey.trait.Trait;

public class Mutant implements Comparable<Mutant> {
    private int goodness;
    private int badness;
    private int ugliness;

    private int accumulatedReward = 0;

    public Mutant() {

    }

    public Mutant(int goodness, int badness, int ugliness) {
        this.goodness = goodness;
        this.badness = badness;
        this.ugliness = ugliness;
    }

    public int getGoodness() {
        return goodness;
    }

    public void setGoodness(int goodness) {
        this.goodness = goodness;
    }

    public int getBadness() {
        return badness;
    }

    public void setBadness(int badness) {
        this.badness = badness;
    }

    public int getUgliness() {
        return ugliness;
    }

    public void setUgliness(int ugliness) {
        this.ugliness = ugliness;
    }

    public int getAccumulatedReward() {
        return accumulatedReward;
    }

    public void setAccumulatedReward(int accumulatedReward) {
        this.accumulatedReward = accumulatedReward;
    }

    public Trait getTrait() {
        return Trait.determineDominantTrait(this);
    }

    @Override
    public int compareTo(Mutant o) {
        return this.getAccumulatedReward() - o.getAccumulatedReward();
    }

    @Override
    public String toString() {
        return "Mutant{" +
                "goodness=" + goodness +
                ", badness=" + badness +
                ", ugliness=" + ugliness +
                ", accumulatedReward=" + accumulatedReward +
                ", trait=" + getTrait() +
                '}';
    }
}
