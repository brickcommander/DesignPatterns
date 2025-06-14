package StrategyDesignPattern.Strategy;

public class OffroadDriveStrategy implements DriveStrategy {

    public OffroadDriveStrategy() {
        System.out.println("Constructor: Offroad Drive Strategy");
    }

    @Override
    public void drive() {
        System.out.println("Offroad Drive Strategy");
    }
}