public class Q2_W4 {

    static class Employee {

        String empId;
        double salary;

        Employee(String empId, double salary) {
            this.empId = empId;
            this.salary = salary;
        }

        void raiseSalary(double amount) {
            if (amount > 0) {
                salary = salary + amount;
            }
        }

        void printSalary() {
            System.out.println(empId + " | Final Salary: Rs " + salary);
        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("E-101", 40000);
        Employee employee2 = new Employee("E-102", 55000);
        Employee employee3 = new Employee("E-103", 62000);
        Employee employee4 = new Employee("E-104", 48000);

        employee1.raiseSalary(5000);
        employee2.raiseSalary(5000);
        employee3.raiseSalary(5000);
        employee4.raiseSalary(5000);

        employee1.printSalary();
        employee2.printSalary();
        employee3.printSalary();
        employee4.printSalary();
    }
}