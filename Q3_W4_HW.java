public class Q3_W4_HW {

    static class ParkingTicket {

        String vehicleNo;
        double ratePerMinute;

        ParkingTicket(String vehicleNo, double ratePerMinute) {
            this.vehicleNo = vehicleNo;
            this.ratePerMinute = ratePerMinute;
        }

        final double calculateFine(int overtimeMinutes) {
            return overtimeMinutes * ratePerMinute;
        }

        final void printReceipt(int overtimeMinutes) {

            if (overtimeMinutes <= 0) {
                System.out.println(vehicleNo
                        + " - No fine, within allotted time");
            } else {
                double fine = calculateFine(overtimeMinutes);

                System.out.println(vehicleNo
                        + " - Fine: Rs. " + fine);
            }
        }
    }

    public static void main(String[] args) {

        String[] vehicleNos = {
            "TN09AB1234",
            "TN22CD5678",
            "TN09EF9012",
            "TN10GH3456"
        };

        double[] ratePerMinute = {
            2,
            2,
            3,
            2
        };

        int[] overtimeMinutes = {
            15,
            -5,
            0,
            8
        };

        ParkingTicket[] tickets = new ParkingTicket[vehicleNos.length];

        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new ParkingTicket(
                    vehicleNos[i],
                    ratePerMinute[i]
            );
        }

        for (int i = 0; i < tickets.length; i++) {

            if (overtimeMinutes[i] > 0) {
                tickets[i].printReceipt(overtimeMinutes[i]);
            } else {
                tickets[i].printReceipt(overtimeMinutes[i]);
            }
        }
    }
}