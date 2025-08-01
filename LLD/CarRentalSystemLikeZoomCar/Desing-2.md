Certainly! Here’s a **complete, concise Car Rental System LLD** using **Factory**, **Strategy**, and **Observer** patterns.  
This example includes models, services, and demonstrates usage.

---

### **Models**

````java
// Car.java
public interface Car {
    String getType();
    double getBasePrice();
}

// Sedan.java
public class Sedan implements Car {
    public String getType() { return "Sedan"; }
    public double getBasePrice() { return 1000; }
}

// SUV.java
public class SUV implements Car {
    public String getType() { return "SUV"; }
    public double getBasePrice() { return 1500; }
}

// User.java
public class User {
    private int userId;
    private String name;
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }
    public String getName() { return name; }
}

// Booking.java
public class Booking {
    private int bookingId;
    private User user;
    private Car car;
    private double price;
    public Booking(int bookingId, User user, Car car, double price) {
        this.bookingId = bookingId;
        this.user = user;
        this.car = car;
        this.price = price;
    }
    public String getSummary() {
        return "Booking#" + bookingId + ": " + user.getName() + " booked " + car.getType() + " for Rs." + price;
    }
}
````

---

### **Factory Pattern**

````java
// CarFactory.java
public class CarFactory {
    public static Car createCar(String type) {
        switch (type) {
            case "Sedan": return new Sedan();
            case "SUV": return new SUV();
            default: throw new IllegalArgumentException("Unknown car type");
        }
    }
}
````

---

### **Strategy Pattern**

````java
// PricingStrategy.java
public interface PricingStrategy {
    double calculatePrice(Car car, int hours);
}

// RegularPricing.java
public class RegularPricing implements PricingStrategy {
    public double calculatePrice(Car car, int hours) {
        return car.getBasePrice() * hours;
    }
}

// WeekendPricing.java
public class WeekendPricing implements PricingStrategy {
    public double calculatePrice(Car car, int hours) {
        return car.getBasePrice() * hours * 1.2;
    }
}
````

---

### **Observer Pattern**

````java
// Observer.java
public interface Observer {
    void update(String message);
}

// EmailNotifier.java
public class EmailNotifier implements Observer {
    public void update(String message) {
        System.out.println("Email: " + message);
    }
}

// BookingNotifier.java
public class BookingNotifier {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) { observers.add(o); }
    public void notifyAllObservers(String message) {
        for (Observer o : observers) o.update(message);
    }
}
````

---

### **Service Layer**

````java
// CarRentalService.java
import java.util.*;

public class CarRentalService {
    private int bookingCounter = 1;
    private BookingNotifier notifier = new BookingNotifier();
    private PricingStrategy pricingStrategy = new RegularPricing();

    public void addObserver(Observer observer) {
        notifier.addObserver(observer);
    }

    public void setPricingStrategy(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
    }

    public Booking bookCar(User user, String carType, int hours) {
        Car car = CarFactory.createCar(carType);
        double price = pricingStrategy.calculatePrice(car, hours);
        Booking booking = new Booking(bookingCounter++, user, car, price);
        notifier.notifyAllObservers("Booking confirmed: " + booking.getSummary());
        return booking;
    }
}
````

---

### **Demo / Usage**

````java
// Main.java
public class Main {
    public static void main(String[] args) {
        CarRentalService service = new CarRentalService();
        service.addObserver(new EmailNotifier());

        User user = new User(1, "Alice");

        // Regular pricing
        service.setPricingStrategy(new RegularPricing());
        Booking booking1 = service.bookCar(user, "Sedan", 3);

        // Weekend pricing
        service.setPricingStrategy(new WeekendPricing());
        Booking booking2 = service.bookCar(user, "SUV", 2);

        System.out.println(booking1.getSummary());
        System.out.println(booking2.getSummary());
    }
}
````

---

**This code demonstrates:**
- **Factory Pattern:** Car creation.
- **Strategy Pattern:** Flexible pricing.
- **Observer Pattern:** Booking notifications.
- **Service Layer:** Booking orchestration.

Let me know if you want to add more features (search, cancel, payment, etc.)!