package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    private String email = null;
    private StocksObservable observable;

    public EmailAlertObserverImpl(String email, StocksObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        notifyCustomer();
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Sending Email to: " + email);
    }
}
