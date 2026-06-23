package Exercise4_Adapter;

public class Main {

    interface PaymentProcessor {
        void processPayment();
    }

    static class PayPalGateway {

        public void makePayment() {
            System.out.println("Payment processed using PayPal Gateway");
        }
    }

    static class PaymentAdapter implements PaymentProcessor {

        private PayPalGateway gateway;

        public PaymentAdapter(PayPalGateway gateway) {
            this.gateway = gateway;
        }

        public void processPayment() {
            gateway.makePayment();
        }
    }

    public static void main(String[] args) {

        PayPalGateway gateway = new PayPalGateway();

        PaymentProcessor processor =
                new PaymentAdapter(gateway);

        processor.processPayment();
    }
}
