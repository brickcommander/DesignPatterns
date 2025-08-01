package AdapterDesignPattern.Adaptee;

public class WeightMachineImpl implements WeightMachine {
    // this is an existing interface/product. We can't change this
    @Override
    public int getWeightInPound() {
        return 100;
    }
}
