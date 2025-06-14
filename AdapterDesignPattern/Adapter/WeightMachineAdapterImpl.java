package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeightMachine;
import AdapterDesignPattern.Adaptee.WeightMachineImpl;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl() {
        weightMachine = new WeightMachineImpl();
    }


    @Override
    public double getWeightInKG() {
        int weightInPound = weightMachine.getWeightInPound();
        double weightInKG = weightInPound * 0.45;
        return weightInKG;
    }
}
