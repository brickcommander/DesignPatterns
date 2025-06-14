package FacadeDesignPattern;

import FacadeDesignPattern.ComplexSystem.*;
import FacadeDesignPattern.model.Product;

public class OrderFacadeImpl implements OrderFacade {
    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    Notification notification;

    public OrderFacadeImpl() {
        productDao = new ProductDaoImpl();
        invoice = new InvoiceImpl();
        payment = new PaymentImpl();
        notification = new NotificationImpl();
    }

    public void createOrder() {
        Product product = productDao.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
    }
}