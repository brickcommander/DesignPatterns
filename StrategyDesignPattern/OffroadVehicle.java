package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.OffroadDriveStrategy;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle() {
        super(new OffroadDriveStrategy());
        System.out.println("Constructor: OffroadVehicle");
    }
}
