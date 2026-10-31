
public class Q4_W7_HW {

    static abstract class ClassroomDevice {
        abstract void operate();
    }

    interface Chargeable {
        void charge();

        void charge(int minutes);
    }

    static class Tablet extends ClassroomDevice implements Chargeable {
        String assetTag;

        Tablet(String assetTag) {
            this.assetTag = assetTag;
        }

        void operate() {
            System.out.println("Tablet " + assetTag + " is operating");
        }

        public void charge() {
            System.out.println("Tablet is charging");
        }

        public void charge(int minutes) {
            System.out.println("Tablet charged for " + minutes + " minutes");
        }
    }

    public static void main(String[] args) {
        Tablet tablet = new Tablet("TAB101");

        tablet.operate();
        tablet.charge();
        tablet.charge(30);
    }
}