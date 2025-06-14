package StrategyDesignPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

    public NormalDriveStrategy() {
        System.out.println("Constructor: Normal Drive Strategy");
    }

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}