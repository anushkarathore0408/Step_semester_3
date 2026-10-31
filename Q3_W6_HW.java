
import java.util.Arrays;

public class Q3_W6_HW {

    static class GymMember {
        private int[] lateFeeHistory = new int[10];
        private int feeCount = 0;
        private int totalLateFees = 0;

        protected void chargeLateFee(int amount) {
            if (feeCount < 10) {
                lateFeeHistory[feeCount] = amount;
                feeCount++;
                totalLateFees += amount;
            }
        }

        public int[] getLateFeeHistory() {
            return Arrays.copyOf(lateFeeHistory, feeCount);
        }

        public int getTotalLateFees() {
            return totalLateFees;
        }
    }

    static class PremiumMember extends GymMember {
        private String memberId;
        private int monthlyFee;
        private String trainerName;

        public PremiumMember(String memberId, int monthlyFee, String trainerName) {
            this.memberId = memberId;
            this.monthlyFee = monthlyFee;
            this.trainerName = trainerName;
        }

        @Override
        protected void chargeLateFee(int amount) {
            super.chargeLateFee(amount / 2);
        }
    }

    public static void main(String[] args) {

        PremiumMember p = new PremiumMember("MEM5", 2000, "Coach Riya");

        p.chargeLateFee(200);

        System.out.println(p.getTotalLateFees());

        int[] history = p.getLateFeeHistory();
        history[0] = 999;

        System.out.println(Arrays.toString(p.getLateFeeHistory()));
    }
}