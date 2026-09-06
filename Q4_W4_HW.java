public class Q4_W4_HW {

    static class MembershipCard {

        static String libraryName;
        static String validUntil;

        String studentName;

        static {
            libraryName = "SRM Central Library";
            validUntil = "May 2027";

            System.out.println("Library info loaded");
        }

        MembershipCard(String studentName) {
            this.studentName = studentName;
        }

        void printCard() {
            System.out.println("Membership card issued: " + studentName);
        }
    }

    public static void main(String[] args) {

        String[] names = {
            "Ananya",
            "Rohan",
            "Priya",
            "Arjun",
            "Sneha"
        };

        MembershipCard[] cards = new MembershipCard[names.length];

        for (int i = 0; i < names.length; i++) {
            cards[i] = new MembershipCard(names[i]);
            cards[i].printCard();
        }
    }
}