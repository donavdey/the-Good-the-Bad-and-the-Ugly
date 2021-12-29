package don.avdey.simulation;

import don.avdey.environment.*;
import don.avdey.mutant.Mutant;
import don.avdey.mutant.MutantFactory;
import don.avdey.mutant.RandomMutantFactory;

import java.util.List;

public class BasicSimulationFactory implements SimulationFactory {

    private static final MutantFactory MUTANT_FACTORY = new RandomMutantFactory();

    @Override
    public BasicSimulation create(SimulationParameters simulationParameters) {
        Mutator mutator = new BasicMutator(simulationParameters.getMutationFactor());
        Replicator replicator = new BasicReplicator(simulationParameters.getReproductionNumber());
        Utilizer utilizer = new BasicUtilizer(simulationParameters.getPopulationSize());
        Encounter encounter = new BasicEncounter(simulationParameters.getRewardUnit());
        List<Mutant> initialPopulation = MUTANT_FACTORY.createPopulation(simulationParameters.getPopulationSize());
        return new BasicSimulation(mutator, replicator, utilizer, encounter, simulationParameters.getInteractionsNumber(), initialPopulation);
    }

}
