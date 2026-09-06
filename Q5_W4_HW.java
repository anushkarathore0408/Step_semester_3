public class Q5_W4_HW {

    static class Payment {

        void pay(double amount) {
            System.out.println("Paid (cash): Rs " + amount);
        }
    }

    static class CardPayment extends Payment {

        void pay(double amount) {
            double fee = amount * 0.02;
            double total = amount + fee;

            System.out.println("Charged (card, incl. fee): Rs " + total);
        }
    }

    static void processTransaction(Payment payment, double amount) {
        payment.pay(amount);
    }

    public static void main(String[] args) {

        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {
            100,
            50,
            200,
            75,
            120
        };

        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {

            processTransaction(payments[i], amounts[i]);

            if (payments[i] instanceof CardPayment) {
                double fee = amounts[i] * 0.02;
                totalCollected = totalCollected + amounts[i] + fee;
            } else {
                totalCollected = totalCollected + amounts[i];
            }
        }

        System.out.println("Total collected: Rs " + totalCollected);
    }
}