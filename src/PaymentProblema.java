public class PaymentProblema {
    interface Payment {
        void processPayment();
    }

    abstract class OnlinePayment implements Payment {
        protected double amount;

        public OnlinePayment(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }

    }

    class CreditCardPayment extends OnlinePayment {
        private String cardNumber;

        public CreditCardPayment(double amount, String cardNumber) {
            super(amount);
            this.cardNumber = cardNumber;
        }

        @Override
        public void processPayment() {
            System.out.println("Processing credit card payment...");
            System.out.println("Card Number: " + cardNumber);
            System.out.println("Amount Charged: " + amount);
        }
    }

    class PayPalPayment extends OnlinePayment {
        private String email;

        public PayPalPayment(double amount, String email) {
            super(amount);
            this.email = email;
        }

        @Override
        public void processPayment() {
            System.out.println("Processing PayPal payment...");
            System.out.println("Email: " + email);
            System.out.println("Amount Charged: " + amount);
        }
    }

    public class PaymentTest {
        public void main(String[] args) {
            Payment creditCardPayment = new CreditCardPayment(150.00, "1234-5678-9876-5432");
            creditCardPayment.processPayment();

            Payment payPalPayment = new PayPalPayment(85.75, "user@example.com");
            payPalPayment.processPayment();
        }
    }

}
