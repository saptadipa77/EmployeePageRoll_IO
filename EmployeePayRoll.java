import java.util.Scanner;

public class EmployeePayRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name");
        String name = sc.next();
        System.out.println("Enter Employee Salary");
        double salary = sc.nextDouble();

        Employee emp=new Employee(id,name,salary);
        System.out.println("Employee Payroll:");
        System.out.println(emp);
    }
}
