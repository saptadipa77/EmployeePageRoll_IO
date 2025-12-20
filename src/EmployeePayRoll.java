import java.util.Scanner;

public class EmployeePayRoll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");

        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        System.out.println("Employee Payroll:");
        System.out.println(emp);
    }
}
