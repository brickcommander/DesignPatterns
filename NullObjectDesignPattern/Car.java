package NullObjectDesignPattern;

public class Car implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 10;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
