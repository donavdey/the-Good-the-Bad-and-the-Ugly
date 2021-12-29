package don.avdey.environment;

import don.avdey.mutant.Mutant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicUtilizer implements Utilizer {

    @Override
    public List<Mutant> utilize(List<Mutant> population) {
        double survivalPercentage = Dice.INSTANCE.rollForSurvival();
        int newPopulationSize = (int) (population.size() * survivalPercentage);
        return population.stream().sorted().limit(newPopulationSize).collect(Collectors.toCollection(ArrayList::new));
    }

}
