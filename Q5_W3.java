import java.util.Scanner;

public class Q5_W3 {

    static class Student {
        String name;
        int attendance;

        static String collegeName = "SRM Institute of Science and Technology";
        static int studentCount = 0;

        Student(String name, int attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        static void printCollegeInfo() {
            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        int attendance1 = sc.nextInt();

        String name2 = sc.next();
        int attendance2 = sc.nextInt();

        Student student1 = new Student(name1, attendance1);
        Student student2 = new Student(name2, attendance2);

        Student.printCollegeInfo();
    }
}