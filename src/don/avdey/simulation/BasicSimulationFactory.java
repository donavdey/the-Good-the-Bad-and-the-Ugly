package don.avdey.simulation;

import don.avdey.environment.*;
import don.avdey.mutant.MutantFactory;
import don.avdey.mutant.RandomMutantFactory;

public class BasicSimulationFactory implements SimulationFactory {

    private static final MutantFactory MUTANT_FACTORY = new RandomMutantFactory();

    @Override
    public BasicSimulation create(SimulationParameters simulationParameters) {
        Mutator mutator = new BasicMutator(simulationParameters.getMutationFactor());
        Replicator replicator = new BasicReplicator(simulationParameters.getReproductionNumber());
        Utilizer utilizer = new BasicUtilizer();
        Encounter encounter = new BasicEncounter(simulationParameters.getRewardUnit());
        return new BasicSimulation(mutator, replicator, utilizer, encounter, simulationParameters.getInteractionsNumber(),
                MUTANT_FACTORY.createPopulation(simulationParameters.getInitialPopulationSize()));
    }

}
