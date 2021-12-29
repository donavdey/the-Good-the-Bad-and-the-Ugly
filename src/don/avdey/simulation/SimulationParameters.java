package don.avdey.simulation;

public class SimulationParameters {
    private final int rewardUnit;
    private final int reproductionNumber;
    private final float mutationFactor;
    private final int populationSize;
    private final int interactionsNumber;

    public SimulationParameters(int rewardUnit, int reproductionFactor, float mutationFactor, int populationSize,
                                int interactionsNumber) {
        this.rewardUnit = rewardUnit;
        this.reproductionNumber = reproductionFactor;
        this.mutationFactor = mutationFactor;
        this.populationSize = populationSize;
        this.interactionsNumber = interactionsNumber;
    }

    public int getRewardUnit() {
        return rewardUnit;
    }

    public int getReproductionNumber() {
        return reproductionNumber;
    }

    public float getMutationFactor() {
        return mutationFactor;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public int getInteractionsNumber() {
        return interactionsNumber;
    }

}
