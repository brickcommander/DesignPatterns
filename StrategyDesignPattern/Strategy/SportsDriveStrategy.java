package StrategyDesignPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

    public SportsDriveStrategy() {
        System.out.println("Constructor: Sports Drive Strategy");
    }

    @Override
    public void drive() {
        System.out.println("Sports Drive Strategy");
    }
}