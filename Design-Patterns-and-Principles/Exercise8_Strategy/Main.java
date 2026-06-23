package Exercise8_Strategy;



public class Main {

    interface PaymentStrategy {
        void pay(int amount);
    }

    static class CreditCardPayment implements PaymentStrategy {

        public void pay(int amount) {
            System.out.println("Paid ₹" + amount + " using Credit Card");
        }
    }

    static class PayPalPayment implements PaymentStrategy {

        public void pay(int amount) {
            System.out.println("Paid ₹" + amount + " using PayPal");
        }
    }

    static class PaymentContext {

        private PaymentStrategy strategy;

        public PaymentContext(PaymentStrategy strategy) {
            this.strategy = strategy;
        }

        public void makePayment(int amount) {
            strategy.pay(amount);
        }
    }

    public static void main(String[] args) {

        PaymentContext payment1 =
                new PaymentContext(new CreditCardPayment());

        payment1.makePayment(5000);

        PaymentContext payment2 =
                new PaymentContext(new PayPalPayment());

        payment2.makePayment(3000);
    }
}
