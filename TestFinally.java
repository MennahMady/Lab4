import java.io.*;

public class TestFinally {
    public static void main(String[] args) {
        FileInputStream in1 = null;
        FileInputStream in2 = null;
        // Open an existing file trycatch.txt
        File inputFile1 = new File("trycatch.txt");
        // Open a non-existent file nosuchfile.abc
        File inputFile2 = new File("nosuchfile.abc");

        // Get file handlers in Byte Stream format
        try {
            in1 = new FileInputStream(inputFile1);
        } catch (FileNotFoundException e) {
            System.out.println("File 'trycatch.txt' not found.");
        }
        try {
            in2 = new FileInputStream(inputFile2);
        } catch (FileNotFoundException e) {
            System.out.println("File 'nosuchfile.abc' not found.");
        }

        int c1;
        // Try to read 'nosuchfile.abc' till the end of File
        try {
            while ((c1 = in2.read()) != -1) {
                System.out.println("Read from nosuchfile.abc");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file 'nosuchfile.abc': " + e.getMessage());
        } finally {
            // Close the files
            try {
                in1.close();
            } catch (IOException e) {
                System.out.println("Error closing file 'trycatch.txt': " + e.getMessage());
            }
            System.out.println("Closing file 'trycatch.txt' inside finally block.");
            try {
                in2.close();
            } catch (IOException e) {
                System.out.println("Error closing file 'nosuchfile.abc': " + e.getMessage());
            }
            System.out.println("Closing file 'nosuchfile.abc' inside finally block.");
        }
    }
}
