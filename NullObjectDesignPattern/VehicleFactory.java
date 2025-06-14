package NullObjectDesignPattern;

public class VehicleFactory {
    public static Vehicle getObject(String typeOfVehicle) {
        if("Car".equals(typeOfVehicle)) {
            return new Car();
        }
        // returning NullObject instead of null
        return new NullVehicle();
    }
}
