package don.avdey.simulation;

import don.avdey.environment.*;
import don.avdey.mutant.Mutant;
import don.avdey.trait.Trait;

import java.util.List;
import java.util.Set;

public class BasicSimulation implements Simulation {

    private final Mutator mutator;
    private final Replicator replicator;
    private final Utilizer utilizer;
    private final Encounter encounter;

    private List<Mutant> population;
    private final int interactionsNumber;


    BasicSimulation(Mutator mutator, Replicator replicator, Utilizer utilizer, Encounter encounter,
                    int interactionsNumber, List<Mutant> initialPopulation) {
        this.mutator = mutator;
        this.replicator = replicator;
        this.utilizer = utilizer;
        this.encounter = encounter;
        this.population = initialPopulation;
        this.interactionsNumber = interactionsNumber;
    }


    @Override
    public void takeTurn() {
        // interact
        for (int i = 0; i < this.population.size(); i++) {
            Mutant protagonist = this.population.get(i);
            Set<Integer> mutantIndicesToEncounter = Dice.INSTANCE.rollForIndices(Math.min(this.interactionsNumber, this.population.size()-1), this.population.size(), i);
            for (int index : mutantIndicesToEncounter) {
                Mutant antagonist = this.population.get(index);
                this.encounter.encounter(protagonist, antagonist);
            }
        }

        // utilize
        this.population = this.utilizer.utilize(this.population);
        int populationSizeAfterUtilization = this.population.size();
        for (int i = 0; i < populationSizeAfterUtilization; i++) {
            this.population.addAll(this.replicator.replicate(this.population.get(i)));
        }

        // mutate
        for (int i = 0; i < this.population.size(); i++) {
            population.set(i, this.mutator.mutate(this.population.get(i)));
        }
    }

    @Override
    public void simulate(int steps) {
        System.out.println("Initial population:" +
                "\nGood mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.GOOD)).count()) / this.population.size() * 100 +
                "\nBad mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.BAD)).count()) / this.population.size() * 100 +
                "\nUgly mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.UGLY)).count()) / this.population.size() * 100
                + "\n\n");


        for (int i = 0; i < steps; i++) {
            if (i != 0 && i % 10 == 0) {
                System.out.println(i + " iteration's population:" +
                        "\nGood mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.GOOD)).count()) / this.population.size() * 100 +
                        "\nBad mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.BAD)).count()) / this.population.size() * 100 +
                        "\nUgly mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.UGLY)).count()) / this.population.size() * 100
                        + "\n\n");
            }
            this.takeTurn();
        }

        System.out.println("Final population:" +
                "\nGood mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.GOOD)).count()) / this.population.size() * 100 +
                "\nBad mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.BAD)).count()) / this.population.size() * 100 +
                "\nUgly mutants: " + (1.0 * this.population.stream().filter(mutant -> mutant.getTrait().equals(Trait.UGLY)).count()) / this.population.size() * 100
                + "\n\n");
    }
}
