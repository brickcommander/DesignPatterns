package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IPhoneStocksObservable;
import ObserverDesignPattern.Observable.StocksObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.NotificationAlertObserver;
import ObserverDesignPattern.Observer.SMSAlertObserverImpl;

public class Main {
    public static void main(String args[]) {
        StocksObservable observable = new IPhoneStocksObservable();
        NotificationAlertObserver observer1 = new SMSAlertObserverImpl("observer1_PhoneNo", observable);
        NotificationAlertObserver observer2 = new SMSAlertObserverImpl("observer2_PhoneNo", observable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("observer3_Email", observable);

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.addStock(10);
    }
}
