package don.avdey.environment;

import don.avdey.mutant.Mutant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicUtilizer implements Utilizer {

    private final int populationSize;

    public BasicUtilizer(int populationSize) {
        this.populationSize = populationSize;
    }

    @Override
    public List<Mutant> utilize(List<Mutant> population) {
        return population.stream().sorted(Comparator.reverseOrder()).limit(populationSize).collect(Collectors.toCollection(ArrayList::new));
    }

}
