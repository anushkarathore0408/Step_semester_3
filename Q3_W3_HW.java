import java.util.Scanner;

public class Q3_W3_HW {

    static class Employee {

        String empId;
        String empName;
        double salary;
        boolean isIntern;

        Employee(String empId, String empName, double salary) {
            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
            this.isIntern = false;
        }

        Employee(String empId, String empName) {
            this(empId, empName, 0);
            this.isIntern = true;
        }

        void printProfile() {
            System.out.println(empId + " | " + empName
                    + " | Rs " + salary
                    + " | Intern: " + isIntern);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String empId1 = sc.next();
        String empName1 = sc.next();
        double salary1 = sc.nextDouble();

        Employee employee1 =
                new Employee(empId1, empName1, salary1);

        String empId2 = sc.next();
        String empName2 = sc.next();

        Employee employee2 =
                new Employee(empId2, empName2);

        employee1.printProfile();
        employee2.printProfile();
    }
}