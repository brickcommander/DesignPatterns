package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
        System.out.println("Constructor: Vehicle");
        driveObject.drive();
    }
}
