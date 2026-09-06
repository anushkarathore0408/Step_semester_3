import java.util.Scanner;

public class Q1_W3 {

    static class PlacementRecord {
        String studentName;
        String company;
        double packageLPA;

        PlacementRecord(String studentName, String company, double packageLPA) {
            this.studentName = studentName;
            this.company = company;
            this.packageLPA = packageLPA;
        }

        void printOfferDetails() {
            System.out.println(studentName + " -> " + company + " @ " + packageLPA + " LPA");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PlacementRecord[] records = new PlacementRecord[3];

        for (int i = 0; i < 3; i++) {
            String studentName = sc.next();
            String company = sc.next();
            double packageLPA = sc.nextDouble();

            records[i] = new PlacementRecord(studentName, company, packageLPA);
        }

        for (int i = 0; i < 3; i++) {
            records[i].printOfferDetails();
        }
    }
}