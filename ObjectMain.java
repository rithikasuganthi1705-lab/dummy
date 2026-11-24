
import java.util.*;

interface Observer {
    void update(String status);
}

class Customer implements Observer {
    public void update(String status) {
        System.out.println("Customer Notification: " + status);
    }
}

class Order {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setStatus(String status) {
        System.out.println("Order Status: " + status);

        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}

public class ObjectMain {
    public static void main(String[] args) {

        Order order = new Order();

        Customer customer = new Customer();

        order.addObserver(customer);

        order.setStatus("Your order has been placed successfully.");
        order.setStatus("Your order has been packed.");
        order.setStatus("Your order has been shipped.");
        order.setStatus("Your order has been delivered successfully.");
    }
}

