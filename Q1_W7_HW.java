public class Q1_W7_HW {

    interface Ringable {
        String ring();
    }

    static class AlarmClock implements Ringable {
        String time;

        AlarmClock(String time) {
            this.time = time;
        }

        public String ring() {
            return "Alarm ringing at " + time;
        }
    }

    static class Doorbell implements Ringable {
        String location;

        Doorbell(String location) {
            this.location = location;
        }

        public String ring() {
            return "Doorbell ringing at " + location;
        }
    }

    static void ringAll(Ringable[] devices) {
        for (Ringable device : devices) {
            System.out.println(device.ring());
        }
    }

    public static void main(String[] args) {
        AlarmClock alarm = new AlarmClock("7:00 AM");
        Doorbell doorbell = new Doorbell("Front Door");

        Ringable[] devices = {alarm, doorbell};

        ringAll(devices);
    }
}