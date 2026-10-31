
public class Q5_W7_HW {

    static abstract class Drone {
        abstract void fly();
    }

    interface Trackable {
        String getLocation();
    }

    static class DeliveryDrone extends Drone implements Trackable {

        void fly() {
            System.out.println("Delivery drone is flying");
        }

        public String getLocation() {
            return "Delivery drone location: Rooftop";
        }
    }

    static class ScoutDrone extends Drone {

        void fly() {
            System.out.println("Scout drone is flying");
        }
    }

    static class GroundRobot implements Trackable {

        public String getLocation() {
            return "Ground robot location: Warehouse";
        }
    }

    static void getLocationIfTrackable(Object o) {
        if (o instanceof Trackable) {
            Trackable t = (Trackable) o;
            System.out.println(t.getLocation());
        } else {
            System.out.println("Tracking not available");
        }
    }

    public static void main(String[] args) {
        DeliveryDrone delivery = new DeliveryDrone();
        ScoutDrone scout = new ScoutDrone();
        GroundRobot robot = new GroundRobot();

        delivery.fly();
        scout.fly();

        getLocationIfTrackable(delivery);
        getLocationIfTrackable(scout);
        getLocationIfTrackable(robot);
    }
}
