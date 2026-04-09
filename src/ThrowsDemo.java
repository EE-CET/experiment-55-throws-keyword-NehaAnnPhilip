import java.util.Scanner;
import java.io.IOException;

public class ThrowsDemo {
    
    // TODO: Define static method check(int n) that throws IOException
    public static void check(int n) throws IOException {
        // If n < 0, throw new IOException()
        if (n < 0) {
            throw new IOException();
        } 
        // Else, print n
        else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read n
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // TODO: try {
            try {
                // call check(n)
                check(n);
            } 
            // } catch (IOException e) {
            catch (IOException e) {
                // Print "Caught: IO Exception"
                System.out.println("Caught: IO Exception");
            }
        }
        
        scanner.close();
    }
}
