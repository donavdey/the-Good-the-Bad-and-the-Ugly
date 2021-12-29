package don.avdey.simulation;

public interface SimulationFactory {
    BasicSimulation create(SimulationParameters simulationParameters);
}
