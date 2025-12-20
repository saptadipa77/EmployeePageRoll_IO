import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeFileW {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();

            System.out.println("Enter Employee Name:");
            String name = sc.next();

            System.out.println("Enter Employee Salary:");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }
        writeToFile(employees);
        System.out.println("Employees written to payroll.txt successfully");
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeToFile(ArrayList<Employee> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("payroll.txt"))) {
            for (Employee e : list) {
                bw.write(e.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("payroll.txt"));

        String line;
        int cntOfEntries=0;
        while((line=br.readLine())!=null){
            System.out.println(line);
            cntOfEntries++;
        }
        br.close();
        System.out.println("Number of entries: "+cntOfEntries);
    }
}


