package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    // This Class has information about the stocks of a item and about the users who has clicked on "Inform me" when stock is available.
    public void deleteObserver(NotificationAlertObserver observer);

    public void addObserver(NotificationAlertObserver observer);

    public void notifyAllObserver();

    public void addStock(int newStock);

    public void reduceStock(int reduceBy);
}
