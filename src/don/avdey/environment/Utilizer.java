package don.avdey.environment;

import don.avdey.mutant.Mutant;

import java.util.List;

public interface Utilizer {
    List<Mutant> utilize(List<Mutant> population);
}
