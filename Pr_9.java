import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pr_9 
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sudokuNuInput.sudoku");
        Scanner sc = new Scanner(file);
        final int a = 9;

        int[] ekThiNav = new int[9];
        for (int i = 0; i < ekThiNav.length; i++)
            ekThiNav[i] = i + 1;

        int[][] sudoku = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                sudoku[i][j] = sc.nextInt();
                if (sudoku[i][j] >= 10) {
                    System.err.println("Element can not be greather then 9");
                    System.exit(1);
                }
            }
        }

        // checking row
        // for (int i = 0; i < a; i++) {
        //     for (int j = 0; j < a; j++) {
                
        //     }
        // }
    }
}