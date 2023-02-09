import java.io.*;

public class TestExceptions {
    public static void main(String[] args){
        File inputFile = new File("Sample.jpg");
        File outputFile1 = new File("Output1.jpg");
        FileInputStream in1 = null;
        FileOutputStream out1 = null;
        try {
            in1 = new FileInputStream(inputFile);
            out1 = new FileOutputStream(outputFile1);
            int c1;
            while ((c1 = in1.read()) != -1) {
                out1.write(c1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        } finally {
            try {
                if (in1 != null) {
                    in1.close();
                }
                if (out1 != null) {
                    out1.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
