import java.io.FileWriter;
import java.io.IOException;

public class EmployeeFileW {

    public static void main(String[] args) throws IOException {

        Employee emp = new Employee(101, "Saptadipa", 50000);

        FileWriter fw = new FileWriter("payroll.txt");
        fw.write(emp.toString());
        fw.close();

        System.out.println("Employee Payroll Written to File");
    }
}

