import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeePayrollService {
    public static void main(String[] args) throws IOException {
        BufferedReader bw=new BufferedReader(new FileReader("payroll.txt"));
        String line;
        int cntOfEntries=0;
        while((line=bw.readLine())!=null)
        {
            System.out.println(line);
            cntOfEntries++;
        }
        bw.close();
        System.out.println("No. of entries "+cntOfEntries);
    }
}
