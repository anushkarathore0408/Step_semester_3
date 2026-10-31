
public class Q1_W7 {

    static abstract class Toy {
        final String toyId;
        static int counter = 1000;

        public Toy() {
            counter++;
            toyId = "TOY-" + counter;
        }

        public abstract String makeSound();

        public String getToyId() {
            return toyId;
        }
    }

    static class ToyCar extends Toy {
        String name;

        public ToyCar(String name) {
            this.name = name;
        }

        public String makeSound() {
            return name + ": Vroom vroom!";
        }
    }

    static class ToyRobot extends Toy {
        String name;

        public ToyRobot(String name) {
            this.name = name;
        }

        public String makeSound() {
            return name + ": Beep boop!";
        }
    }

    public static void main(String[] args) {
        ToyCar c = new ToyCar("Speedster");
        ToyRobot r = new ToyRobot("Bolt");

        System.out.println(c.makeSound());
        System.out.println(r.makeSound());

        System.out.println(c.getToyId());
        System.out.println(r.getToyId());
    }
}