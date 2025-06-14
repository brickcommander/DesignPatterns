package AdapterDesignPattern.Adaptee;

public class WeightMachineImpl implements WeightMachine {
    // this is an existing interface/product. We can't change this
    @Override
    public double getWeightInPound() {
        return 100;
    }
}
