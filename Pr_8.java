/*
    The problem is to write a program that will grade multiple-choice tests. Assume
    there are eight students and ten questions, and the answers are stored in a two-
    dimensional array. Each row records a student’s answers to the questions, as
    shown in the following array.
    Students’ Answers to the Questions:
    0 1 2 3 4 5 6 7 8 9
    Student 0 A B A C C D E E A D
    Student 1 D B A B C A E E A D
    Student 2 E D D A C B E E A D
    Student 3 C B A E D C E E A D
    Student 4 A B D C C D E E A D
    Student 5 B B E C C D E E A D
    Student 6 B B A C C D E E A D
    Student 7 E B E C C D E E A D
    The key is stored in a one-dimensional array:
    Key to the Questions:
    0 1 2 3 4 5 6 7 8 9
    Key D B D C C D A E A D
    Your program grades the test and displays the result. It compares each student’s
    answers with the key, counts the number of correct answers, and displays it.
*/

// Neel Goyani - 21ce036

import java.util.*;

public class Pr_8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        int sn = obj.nextInt();
        System.out.print("Enter the number of Question : ");
        int qn = obj.nextInt();

        String[][] arr = new String[sn][qn];
        for (int i = 0; i < sn; i++) {
            System.out.print("Student " + i + " : ");
            for (int j = 0; j < qn; j++) {
                arr[i][j] = obj.next();
            }
        }
        System.out.println("Enter the Key of all Qustions : ");
        String[] key = new String[qn];
        for (int i = 0; i < qn; i++) {
            key[i] = obj.next();
        }
        int b[] = new int[sn];
        for (int i = 0; i < sn; i++) {
            int c = 0;
            for (int j = 0; j < qn; j++) {
                if (arr[i][j].equals(key[j])) {
                    c++;
                    b[i] = c;
                }
            }
        }
        // System.out.println(c);
        for (int i = 0; i < sn; i++) {
            System.out.println("Student " + i + " : " + b[i]);
        }

        obj.close();
    }
}
