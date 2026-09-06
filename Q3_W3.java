import java.util.Scanner;

public class Q3_W3 {

    static class Course {
        String code;
        String title;
        int credits;
        int labCredits;

        Course(String code, String title, int credits, int labCredits) {
            this.code = code;
            this.title = title;
            this.credits = credits;
            this.labCredits = labCredits;
        }

        Course(String code, String title, int credits) {
            this(code, title, credits, 0);
        }

        int totalCredits() {
            return credits + labCredits;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code1 = sc.next();
        String title1 = sc.nextLine().trim();
        int credits1 = sc.nextInt();

        Course course1 = new Course(code1, title1, credits1);

        String code2 = sc.next();
        String title2 = sc.nextLine().trim();
        int credits2 = sc.nextInt();
        int labCredits2 = sc.nextInt();

        Course course2 = new Course(code2, title2, credits2, labCredits2);

        System.out.println(course1.code + " total credits: " + course1.totalCredits());
        System.out.println(course2.code + " total credits: " + course2.totalCredits());
    }
}