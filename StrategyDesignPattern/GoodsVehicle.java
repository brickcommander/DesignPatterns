package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.OffroadDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new OffroadDriveStrategy());
        System.out.println("Constructor: GoodsVehicle");
    }
}
