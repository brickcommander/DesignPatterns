package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStocksObservable implements StocksObservable {
    private int currentStock = 0;
    private List<NotificationAlertObserver> observersList;

    public IPhoneStocksObservable() {
        observersList = new ArrayList<>();
    }

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void deleteObserver(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (NotificationAlertObserver observer : observersList) {
            observer.update();
        }
    }

    @Override
    public void addStock(int newStock) {
        if (currentStock == 0) { // Send only if earlier it was out of stock
            notifyAllObserver();
        }
        currentStock += newStock;
    }

    @Override
    public void reduceStock(int reduceBy) {
        currentStock -= reduceBy;
    }
}
