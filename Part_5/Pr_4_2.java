// Write a program to show use of byte stream.

// ************* NEEL GOYANI (21CE036) *************

import java.io.*;

// Main class
public class Pr_4_2 {

    // Main driver method
    public static void main(String[] args)
            throws IOException {
        // Initially assigning null ot objects for reading and writing to file
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        // Try block to check for exceptions
        try {

            // Passing the files via local directory
            sourceStream = new FileInputStream("N:\\Collage java\\Assignment\\Part_5\\Pr_2_2.txt");
            targetStream = new FileOutputStream("N:\\Collage java\\Assignment\\Part_5\\Pr_2_2_copy.txt");

            // Reading source file and writing content to target file byte by byte
            int temp;

            // If there is content inside file than read
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte) temp); //

            // Display message for successful execution of program
            System.out.print("Program successfully executed");
        }

        // finally block that executes for sure where we are closing file connections to
        // avoid memory leakage
        finally {

            if (sourceStream != null)
                sourceStream.close();

            if (targetStream != null)
                targetStream.close();
        }
    }
}
