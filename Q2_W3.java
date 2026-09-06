import java.util.Scanner;

public class Q2_W3 {

    static class MessWallet {
        private double balance;

        MessWallet(double balance) {
            if (balance < 0) {
                this.balance = 0;
                System.out.println("Opening balance cannot be negative");
            } else {
                this.balance = balance;
            }
        }

        public void topUp(double amount) {
            if (amount > 0) {
                balance = balance + amount;
            }
        }

        public void deduct(double amount) {
            if (amount > balance) {
                System.out.println("Debit rejected: insufficient balance");
            } else {
                balance = balance - amount;
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double opening = sc.nextDouble();
        MessWallet wallet = new MessWallet(opening);

        double topUpAmount = sc.nextDouble();
        wallet.topUp(topUpAmount);

        double deductAmount = sc.nextDouble();
        wallet.deduct(deductAmount);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}