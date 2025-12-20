import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollService {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("payroll.txt"));
        String line;

        System.out.println("Reading Payroll File:");
        while ((line = br.readLine()) != null) {
            String[] data = line.split(" ");
            System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Salary: " + data[2]);
        }
        br.close();
    }
}

