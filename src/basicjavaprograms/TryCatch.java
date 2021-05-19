package basicjavaprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Test.in"));

            System.out.println("Exit from the main");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found Exception");
        } finally {
            System.out.println("Always run regardless of the occurrence run");
        }
        System.out.println("After try-catch-finally, life goes on..");
    }
}
