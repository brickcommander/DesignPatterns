package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class SMSAlertObserverImpl implements NotificationAlertObserver {
    private String phoneNo = null;
    private StocksObservable observable; // In case, some info of observable is needed to send to the users like how much stock is left

    public SMSAlertObserverImpl(String phoneNo, StocksObservable observable) {
        this.phoneNo = phoneNo;
        this.observable = observable;
    }

    @Override
    public void update() {
        notifyCustomer();
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Sending SMS to: " + phoneNo);
    }
}
