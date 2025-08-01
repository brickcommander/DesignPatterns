## **When to Use Null Object Pattern?**
- When you want to avoid null checks and `NullPointerException`s.
- When you want default, harmless behavior in the absence of a real object.

---

## **Real-Life Example: Logger**

Suppose you have a logging system. Sometimes, you may not want to log anything (for example, in production or testing). Instead of checking for `null` before every log, you use a `NullLogger`.

---

### **Logger Interface**

````java
public interface Logger {
    void log(String message);
}
````

---

### **Concrete Logger**

````java
public class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
````

---

### **Null Object**

````java
public class NullLogger implements Logger {
    public void log(String message) {
        // Do nothing
    }
}
````

---

### **Usage Example**

````java
public class NullObjectDemo {
    public static void main(String[] args) {
        Logger logger = getLogger(false); // false = don't log

        logger.log("This will not be logged!");
    }

    public static Logger getLogger(boolean enableLogging) {
        if (enableLogging) {
            return new ConsoleLogger();
        } else {
            return new NullLogger();
        }
    }
}
````

---

## Why use this NullLogger?
Let's say we have two kinds of requests.
1. high priority request (lock/unlock) - every requests matter
2. low priority request (notification) - doesn't matter if some of them failed

Both requests go through a same flow and, we don't want to print logs for low priority requests? 
Here we can this pattern to print requests only for high priority tasks, even though the code (flow) is same for both requests by passing NullLogger/ConsoleLogger