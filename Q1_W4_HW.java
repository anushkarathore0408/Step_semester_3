public class Q1_W4_HW {

    static class Participant {

        String name;
        String teamName;
        boolean registered;

        Participant(String name, String teamName) {
            this.name = name;
            this.teamName = teamName;
            this.registered = true;
        }

        Participant(String name) {
            this(name, "Unassigned");
        }

        void printStatus() {
            System.out.println(name + " | " + teamName
                    + " | Registered: " + registered);
        }
    }

    public static void main(String[] args) {

        String[] names = {"Ravi", "Meera", "Karthik", "Divya"};

        String[] teamNames = {"ByteBusters", "", "CodeCrackers", ""};

        Participant[] participants = new Participant[names.length];

        for (int i = 0; i < participants.length; i++) {

            if (teamNames[i].equals("")) {
                participants[i] = new Participant(names[i]);
            } else {
                participants[i] = new Participant(names[i], teamNames[i]);
            }

            participants[i].printStatus();
        }
    }
}