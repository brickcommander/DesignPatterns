package NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Here I don't have to check, if vehicle is null before calling getTankCapacity()
        // Here NullVehicle object will have a default behaviour

        Vehicle vehicle = VehicleFactory.getObject("CAR");
        System.out.println(vehicle.getTankCapacity() + " " + vehicle.getSeatingCapacity());

        vehicle = VehicleFactory.getObject("Car");
        System.out.println(vehicle.getTankCapacity() + " " + vehicle.getSeatingCapacity());

        vehicle = VehicleFactory.getObject("Bike");
        System.out.println(vehicle.getTankCapacity() + " " + vehicle.getSeatingCapacity());

    }
}
