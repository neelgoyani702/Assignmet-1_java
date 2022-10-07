// Write a program to enter any 15 numbers from the user and store only even numbers in a file
// named And display the contents of this file on the console.
// (BufferedReader / BufferedWriter).

// ************* NEEL GOYANI (21CE036) *************

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pr_5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int[] arr = new int[n];
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        FileWriter f;
        try {
            f = new FileWriter("Pr_5.txt");
            BufferedWriter bf = new BufferedWriter(f);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    bf.write(arr[i] + " ");
                }
            }
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fr = new FileReader("Pr_5.txt");
        BufferedReader br = new BufferedReader(fr);
        String Int_line;

        while ((Int_line = br.readLine()) != null) {
            String In_Value = Int_line;
            // Print the Integer
            System.out.println(In_Value);
        }
        br.close();
        sc.close();
    }

}
