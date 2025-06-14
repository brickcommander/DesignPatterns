package FacadeDesignPattern;

public class Client {
    public static void main(String[] args) {
        // Here, client is not interacting with complex system. facade is interacting with all of them
        // Client is only interacting with what it needs to know/do
        OrderFacade orderFacade = new OrderFacadeImpl();
        orderFacade.createOrder();
    }
}
