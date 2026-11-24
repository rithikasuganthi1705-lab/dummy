
interface PaymentStrategy {
    void pay();
}

class UPIPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Payment done through UPI");
    }
}

class CreditCardPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Payment done through Credit Card");
    }
}

class NetBankingPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Payment done through Net Banking");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment() {
        strategy.pay();
    }
}

public class Stratergymain {
    public static void main(String[] args) {

        PaymentContext payment = new PaymentContext();

        payment.setPaymentStrategy(new UPIPayment());
        payment.makePayment();

        payment.setPaymentStrategy(new CreditCardPayment());
        payment.makePayment();

        payment.setPaymentStrategy(new NetBankingPayment());
        payment.makePayment();
    }
}

