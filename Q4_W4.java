public class Q4_W4 {

    static class Student {

        String name;

        static String collegeName;
        static String academicYear;

        static {
            collegeName = "SRM Institute of Science and Technology";
            academicYear = "2025-26";

            System.out.println("College info loaded");
        }

        Student(String name) {
            this.name = name;
        }

        void printRecord() {
            System.out.println("Student record created: " + name);
        }
    }

    public static void main(String[] args) {

        String[] names = {
            "Ravi",
            "Meera",
            "Karthik",
            "Divya",
            "Anitha"
        };

        Student[] students = new Student[names.length];

        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i]);
            students[i].printRecord();
        }
    }
}