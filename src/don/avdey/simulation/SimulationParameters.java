package don.avdey.simulation;

public class SimulationParameters {
    private final int rewardUnit;
    private final int reproductionNumber;
    private final float mutationFactor;
    private final int initialPopulationSize;
    private final int interactionsNumber;

    public SimulationParameters(int rewardUnit, int reproductionFactor, float mutationFactor, int initialPopulationSize,
                                int interactionsNumber) {
        this.rewardUnit = rewardUnit;
        this.reproductionNumber = reproductionFactor;
        this.mutationFactor = mutationFactor;
        this.initialPopulationSize = initialPopulationSize;
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

    public int getInitialPopulationSize() {
        return initialPopulationSize;
    }

    public int getInteractionsNumber() {
        return interactionsNumber;
    }

}
