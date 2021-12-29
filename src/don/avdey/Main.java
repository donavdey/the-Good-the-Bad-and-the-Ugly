package don.avdey;

import don.avdey.simulation.BasicSimulationFactory;
import don.avdey.simulation.Simulation;
import don.avdey.simulation.SimulationFactory;
import don.avdey.simulation.SimulationParameters;

public class Main {

    public static void main(String[] args) {
        SimulationParameters simulationParameters = new SimulationParameters(10, 2, 0.05f, 100, 10);

        SimulationFactory simulationFactory = new BasicSimulationFactory();
        Simulation simulation = simulationFactory.create(simulationParameters);

        simulation.simulate(100);
    }
}
