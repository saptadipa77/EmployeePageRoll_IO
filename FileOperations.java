import java.io.File;

public class FileOperations {
    public static void main(String[] args) {
        File file=new File("employee.txt");
        File dir=new File("FileDirectory");

        System.out.println("File Exists: " + file.exists());

        if(file.exists()){
            file.delete();
            System.out.println("File deleted successfully");
        }
        dir.mkdir();
        System.out.println("Directory created successfully");
        try{
            file.createNewFile();
            System.out.println("File created successfully");
        } catch(Exception e){
            e.printStackTrace();
        }

        File current = new File(".");
        String[] files = current.list();

        System.out.println("Listing Files:");
        for (String f : files) {
            System.out.println(f);
        }
    }
}
